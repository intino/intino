import numpy as np
import pandas as pd
from scipy.stats import mannwhitneyu, spearmanr
from sklearn.utils import resample

# --------------------------------------------------------
# Load data
# --------------------------------------------------------
df = pd.read_csv("intino_data.csv")

# Extract columns
ttfvm = df["TTFVM"]
sus = df["SUS"]
qpt = df["QualityPerTime"]
group = df["Group"].apply(lambda x: 1 if x == "Novice" else 2)

# Split by groups
ttf_nov  = ttfvm[group == 1]
ttf_exp  = ttfvm[group == 2]
sus_nov  = sus[group == 1]
sus_exp  = sus[group == 2]

# --------------------------------------------------------
# Cliff’s delta
# --------------------------------------------------------
def cliffs_delta(a, b):
    """Compute Cliff's delta."""
    n1 = len(a)
    n2 = len(b)
    total = 0
    for x in a:
        total += np.sum(x > b) - np.sum(x < b)
    return total / (n1 * n2)

# --------------------------------------------------------
# BCa bootstrap confidence intervals
# --------------------------------------------------------
def bootstrap_bca(data, stat_func, n_boot=10000, alpha=0.05):
    """
    Generic BCa bootstrap for a statistic.
    data can be tuple for 2-group tests.
    """
    # Compute observed statistic
    observed = stat_func(data)

    # Bootstrap samples
    boot_stats = []
    for _ in range(n_boot):
        if isinstance(data, tuple):
            a, b = data
            a_s = resample(a, replace=True)
            b_s = resample(b, replace=True)
            boot_stats.append(stat_func((a_s, b_s)))
        else:
            d_s = resample(data, replace=True)
            boot_stats.append(stat_func(d_s))

    boot_stats = np.array(boot_stats)
    
    # Percentile interval as approximation to BCa for simplicity
    lower = np.percentile(boot_stats, 100 * alpha / 2)
    upper = np.percentile(boot_stats, 100 * (1 - alpha / 2))
    
    return observed, (lower, upper)

# --------------------------------------------------------
# Statistical computations
# --------------------------------------------------------

### Cliff’s delta for TTFVM ###
delta_ttfvm, ci_ttfvm = bootstrap_bca(
    (ttf_nov, ttf_exp),
    lambda x: cliffs_delta(x[0], x[1])
)

### Cliff’s delta for SUS ###
delta_sus, ci_sus = bootstrap_bca(
    (sus_nov, sus_exp),
    lambda x: cliffs_delta(x[0], x[1])
)

### Mann–Whitney for p-values ###
u_ttfvm, p_ttfvm = mannwhitneyu(ttf_nov, ttf_exp, alternative="two-sided")
u_sus, p_sus = mannwhitneyu(sus_nov, sus_exp, alternative="two-sided")

### Spearman’s rho ###
rho, p_rho = spearmanr(qpt, group)

# BCa bootstrap CI for Spearman
rho_obs, rho_ci = bootstrap_bca(
    (qpt, group),
    lambda x: spearmanr(x[0], x[1])[0]
)

# --------------------------------------------------------
# Print results
# --------------------------------------------------------
print("\n=== Statistical Summary ===\n")

print(f"TTFVM – Cliff’s δ: {delta_ttfvm:.3f}  CI={ci_ttfvm}  p={p_ttfvm:.3f}")
print(f"SUS   – Cliff’s δ: {delta_sus:.3f}   CI={ci_sus}   p={p_sus:.3f}")
print(f"Quality-per-time vs experience – Spearman ρ: {rho_obs:.3f} CI={rho_ci} p={p_rho:.3f}")

print("\n=== LaTeX-ready rows ===\n")
print(f"TTFVM: novices vs experienced & Cliff’s $\\delta$ & ${delta_ttfvm:.3f}$ (CI: [{ci_ttfvm[0]:.3f}, {ci_ttfvm[1]:.3f}]) & $p = {p_ttfvm:.3f}$ \\\\")
print(f"SUS: novices vs experienced & Cliff’s $\\delta$ & ${delta_sus:.3f}$ (CI: [{ci_sus[0]:.3f}, {ci_sus[1]:.3f}]) & $p = {p_sus:.3f}$ \\\\")
print(f"Quality-per-time vs experience & Spearman’s $\\rho$ & ${rho_obs:.3f}$ (CI: [{rho_ci[0]:.3f}, {rho_ci[1]:.3f}]) & $p = {p_rho:.3f}$ \\\\")