# Linguaggi - Laboratorio e Progetto Finale
![Linguaggi - UniVR](https://img.shields.io/badge/Linguaggi-UniVR-blueviolet?style=for-the-badge&logo=bookstack&logoColor=white)

Corso di Laurea Triennale in Informatica
**Università di Verona**
Anno Accademico 2024/2025

---

## 🧠 Descrizione

Questa repository raccoglie il lavoro svolto nell'ambito del corso **Linguaggi** (laboratorio e progetto finale).
Contiene tutte le esercitazioni pratiche con **ANTLR4**, e un **elaborato finale** sviluppato come progetto personale.

---

## 📚 Contenuto della repository

### 🧪 Laboratori

Contiene le esercitazioni settimanali sviluppate durante il corso, ciascuna focalizzata su un tema chiave:

| Cartella/File       | Descrizione |
|---------------------|-------------|
| `lab01/`            | Introduzione ad ANTLR4 e alle grammatiche regolari. |
| `lab02/`            | Definizione di parser semplici e gestione del parsing. |
| `lab03/`            | Costruzione di visitor e primi interpreti. |
| `lab04/`            | Analisi del linguaggio Brainfuck: sintassi, semantica e simulazione. |
| `lab05/`            | Gestione di ambiguità, precedenza e associatività nelle grammatiche. |
| `hwXX/`             | Homework individuali o esercizi extra. |

Tutti i file `.g4` sono compatibili con ANTLR4 e possono essere compilati ed eseguiti con Java.

---

### 💻 Elaborato Finale

Cartella: `elaborato/`

Contiene il progetto finale personale. L'obiettivo è dimostrare la capacità di progettare un linguaggio formale completo.
Il progetto include:

- ✅ Definizione di una grammatica completa (lexer + parser)
- ✅ Costruzione di un AST
- ✅ Analisi semantica dove necessaria
- ✅ Implementazione di un interprete o generatore di codice

> 🛠️ **Descrizione progetto (esempio)**
> Il progetto sviluppa un linguaggio chiamato `MiniLang`, progettato per esprimere semplici algoritmi numerici e strutture di controllo.
> Include supporto per variabili, operatori aritmetici, condizioni e cicli, con un interprete Java basato sul visitor pattern.

---

## ▶️ Compilazione e Esecuzione

### ✅ Requisiti

- Java JDK 8 o superiore
- ANTLR4 (disponibile su https://www.antlr.org)

### ⚙️ Compilazione

```bash
antlr4 -visitor -no-listener NomeFile.g4
javac NomeFile*.java

### ▶️ Esecuzione
```bash
grun NomeFile main -gui

Oppure, per vedere i token:
```bash
grun NomeFile main -tokens

## 🧩 Risorse utili

📘 ANTLR4 - Documentazione ufficiale - https://www.antlr.org
📚 Guida ANTLR su GitHub - https://github.com/antlr/antlr4/blob/master/doc/index.md
📖 ANTLR4 - Guida completa - https://tomassetti.me/antlr-mega-tutorial/
📖 ANTLR4 - Guida pratica - https://pragprog.com/titles/tmantlr/antlr-4/

## 🧑‍💻 Autore
Simone Mattioli
Studente del corso di Informatica, Università di Verona
Anno Accademico 2024/2025