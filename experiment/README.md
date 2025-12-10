# Replication Package for *Intino: Facing DSML Adoption Challenge through Language Inheritance and Contract-Based Specialization*

This replication package contains all materials required to reproduce the methodological validation and the user study reported in the paper.

It includes:
- the Intino toolchain and auxiliary scripts,
- analysis scripts and participant-level datasets,
- configuration files.

The package is organized so that reviewers and researchers can reproduce the results with minimal setup.

---

## 1. Directory Structure

replication-package/
│
├── README.md                      # This document
├── LICENSE
│
├── toolchain/                     # Intino toolchain and build configs
│   ├── intino-builder/
│   ├── lsp-server/
│   ├── metta-runtime/
│
├── experiment-sources/                # DSML artifacts used during the study
│   ├── metamodel.tara
│   ├── model.tara
│   └── task-description.pdf
│
├── datasets/
│   ├── results.xlsx
│   ├── telemetry/                 # Timestamps, logs, LSP traces
│   ├── diagnostics/               # Diagnostic payloads for seeded faults
│   └── SUS answers.xlsx
│
├── ground-truth/
│
├── questionnaires.pdf

---

## 2. Software Dependencies

### 2.1 Toolchain Dependencies

| Component | Requirement |
|----------|-------------|
| **Java JDK** | 17 or 21 (study used JDK 21) |
| **Maven** | ≥ 3.9|
| **Node.js** | ≥ 18 |
| **npm / yarn / pnpm** | Any |
| **Git** | ≥ 2.30 |
---



⸻

## 3. Building and Running the Intino Toolchain

### 3.1 Clone the repository

git clone https://github.com/intino/intino.git
cd replication-package/toolchain

### 3.2 Build the toolchain

Option A — Maven

mvn clean install -DskipTests

### 3.3 Run the language server

java -jar lsp-server/build/libs/intino-lsp.jar

The server exposes LSP endpoints for:
	•	the Intino web editor,
	•	IntelliJ plugin,
	•	VSCode extension.

3.4 Run the builder

From any DSML:

cd dsml-artifacts/templates/my-language
intino build

This generates all required artifacts (validator, server, packages) exactly as used in the study.

⸻

4. Loading and Exploring DSML Artifacts

4.1 Explore templates

Located in:

dsml-artifacts/templates/

Each includes:
	•	initial metamodel,
	•	example models,
	•	automatically generated artifacts.

4.2 Use the Intino Web Editor

Start the web editor:

npm install
npm run dev

Open:

http://localhost:5173

Load a DSML via its metamodel package.

4.3 Explore evolution scenarios (VP-2)

dsml-artifacts/evolution-scripts/

Each folder contains:
	•	initial model,
	•	evolution step,
	•	expected diagnostic,
	•	migration log,
	•	final model.

4.4 Explore seeded fault scenarios (VP-3)

dsml-artifacts/seeded-faults/

Includes:
	•	model with injected error,
	•	expected diagnostic,
	•	rule identifier,
	•	LSP log trace.

⸻


## 7. Troubleshooting

Java mismatch

Unsupported class file major version

→ Ensure Java 21 is installed.

LSP not responding

java -jar lsp-server.jar --verbose

Web editor fails to load package

Check:
	•	version in meta.json,
	•	missing constructs,
	•	outdated package format.
