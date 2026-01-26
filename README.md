# Quassar

Quassar is a model-driven engineering (MDE) method and toolchain for building **families of Domain-Specific Modeling Languages (DSMLs)** from a common *mother language*.  
It combines:

- A **mother language** (Tara) with executable semantics and contracts.
- A **metamodeling DSML** (Metta) to define DSML families.
- A **contract-based specialization pipeline** to derive concrete DSMLs.
- A single, **parameterized Language Server** and **web/desktop front-ends**.

This repository contains the reference implementation of Quassar used in the experiments reported in:

> **Facing the DSML Adoption Challenge with a Holistic Approach Based on Language Inheritance and Contract-Based Specialization**  
Roncal Andrés, O. (2025). Quassar. Facing the DSML Adoption Challenge with a Holistic Approach Based on Language Inheritance and Contract-Based Specialization (Version 2.0.0) [Computer software]. https://github.com/quassar-lab/quassar

---

## Table of Contents

- [Overview](#overview)
- [Key Features](#key-features)
- [Architecture](#architecture)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [How to create your own DSML](#how-to-create-your-own-dsml)
- [Reproducing the Study](#reproducing-the-study)
- [License](#license)
- [Citation](#citation)
- [Acknowledgements](#acknowledgements)

---

## Overview

Traditional DSML tooling often requires:

- Duplicated effort per language (editors, validators, generators).
- Poor integration with modern development workflows.
- Weak support for validation and evolution across language families.

Quassar addresses these issues by:

1. **Rooting all DSMLs in a common mother language (Tara)** that defines:
   - Uniform abstract syntax (nodes, properties, references, constraints).
   - Executable semantics and internal contracts.
2. **Using Metta** to define:
   - Metaconcepts and concepts for DSML families (M3 and M2 levels).
   - Families of DSMLs sharing syntax but with different lexicon/semantics.
3. **Specializing DSMLs via a contract-driven pipeline**:
   - M3 → M2 → M1 transformations controlled by explicit contracts.
   - Automatic generation of editors, validators, and IDE integration.
4. **Providing a single parameterized Language Server**:
   - One LSP implementation, many DSMLs.
   - IDE-agnostic integration (web editor, desktop IDEs, etc.).

This repository contains:

- Code of core implementation of Tara and Metta.
- Code of the Quassar builder and builder service.
- Code of the Parameterized Language Server.
- Replication package of the experiment done with users.

---

## Key Features

- **Mother language (Tara)**  
  A generic, executable language capturing structural modeling constructs and internal contracts.

- **Metta: DSML for metamodeling**  
  Defines metaconcepts and concepts for DSML families at M3/M2.

- **Contract-based specialization pipeline**  
  - Derives concrete DSMLs from a shared mother language.
  - Ensures that derived languages conform to the internal contract.

- **Single, parameterized Language Server**  
  - One LSP instance serves multiple DSMLs.
  - DSML is selected/configured via a contract and configuration file.

- **IDE-agnostic integration**  
  - Web-based front-end.
  - Desktop integration via LSP (e.g., VS Code, IntelliJ, …).

- **Smart contracts DSML example**  
  - DSML for modeling smart contracts with semantic constraints.
  - Used in the user study for the SoSyM paper.

---

## Architecture

At a high level, Quassar is structured as:

- **Tara Core & Checker**
  - Mother language interpreter.
  - Evaluates internal contracts and constraints over models.

- **Metta**
  - DSML to define metamodels and DSML families.
  - Used at M3 and M2 levels.

- **Builder**
  - Applies the specialization pipeline (Φ) to:
    - Compile Metta definitions.
    - Generate DSML-specific artifacts (schemas, validators, editors).

- **Builder Service**
  - Exposes the builder as a service (e.g., REST/CLI).
  - Allows other tools (front-end, CI/CD) to trigger DSML generation.

- **Language Server**
  - Single LSP implementation.
  - Parameterized by a DSML configuration and contracts.
  - Provides diagnostics, completion, navigation, etc.

- **Editor**
  - Web-based UI built on top of the Language Server.
  - Allows end users to create, edit, and validate models.

---

## Project Structure

```text
quassar/
├─ language/              # Mother language core and checker (Tara)
├─ metta/                 # Metta DSML implementation
├─ builder/               # Builder that generates DSML artifacts
├─ extended-builder/      # Builder extensions (e.g., accessors, LSP packaging)
├─ builder-sdk/           # SDK for builders/tooling integration
├─ builder-service/       # Builder exposed as a service
├─ language-server/       # Parameterized LSP implementation
├─ editor/                # Web-based UI built on top of the Language Server
├─ editor-elements/       # Editor UI components/elements
├─ experiment/            # Replication package (datasets, scripts, sources)
├─ docker/                # Docker images and helper scripts
└─ out/                   # Build outputs (generated/packaged artifacts)
```

---

## Getting Started

### Prerequisites

- JDK 21
- Maven 3.9
- Node.js / npm 19
- Git

Optional (for experiments):
- Python for statistical analysis
- Additional dependencies listed in `experiment/README.md`

### How to create your own DSML

To create your own language, follow these steps:

1. Install Java 21 or higher.
2. Download the latest builder package from the releases.
3. Select the language. For new creations, you can use Metta to create meta-meta-models (M3) or Proteo for meta-models (M2). You can also use a language created previously.
   In any case, you should specify the language at the beginning of each document to compile.
4. Run the compiler with the following command:


```
    java -jar builder-XXX.jar 
        --level 2 
        --dsl Metta:2.0.0 
        --out-dsl MyNewLanguage:1.0.0 
        MetaModel.tara

```

You can also obtain info about the options of compiler running: 

```
    java -jar tara-builder-XXX.jar --help
```

Its output will be:
```
Usage: tarac <options> <source files>
 where possible options include:
    --level <level>         	    REQUIRED. Specify the abstraction level in MDE: model (1), meta-model (2), meta-meta-model (3)
    --dsl <name:version>	    REQUIRED. Specify the name and version of the language used for define models
    --out-dsl <name:version>        REQUIRED. Specify the name and version of the language created. Not necessary if level is model
    --dsl-repository <directory>    Specify the directory where the language will be found and the output language will be created. Uses '~/.m2/repository' as default
    --encoding <encoding>           Specify character encoding used by source files. UTF-8 is used by default
```

---

## Reproducing the Study

If you are using this repository as the replication package of the paper, the folder:

`experiment/`

contains:
- `datasets/` – anonymized datasets (CSV/XLSX) with TTFVM, F1, SUS, task completion, etc.
- `sources/` – study sources (models, materials, PDFs)
- `scripts/` – analysis scripts and generated outputs
- `questionnaires.pdf` – questionnaires used in the study

To reproduce the main statistical analyses:

```
cd experiment/scripts
python analysis.py
```

The scripts regenerate:
- Summary tables reported in the paper
- Statistical tests and effect sizes for the validation propositions
- Plots included in the replication package


## License

GPL 3.0

---

## Citation

If you use Quassar in academic work, please cite:

@software{Roncal_Andres_Quassar_Facing_DSML_2025,
	author = {Roncal Andrés, Octavio},
	month = dec,
	title = {{Quassar. Facing the DSML Adoption Challenge with a Holistic Approach Based on Language Inheritance and Contract-Based Specialization}},
	url = {https://github.com/quassar-lab/quassar},
	version = {2.0.0},
	year = {2025}
}

---

## Acknowledgements

We thank all participants of the user study and collaborators who provided feedback on the Quassar method and toolchain.


> **Note on repository history**
>
> The code in this repository has been consolidated from several previously
> independent repositories. This reorganization was carried out to:
> (i) provide a single, coherent codebase that matches the architecture
> described in the accompanying paper,
> (ii) simplify maintenance and evolution of the Quassar toolchain, and
> (iii) offer a self-contained replication package for researchers and
> practitioners.
> 
> As a result, the Git history does not fully reflect the original
> development timeline of each component, but all functionality and examples
> required to build, run, and reproduce the reported results are included
> here.
