
# 🧠 MyLang – Linguaggio Interpretato + Brainfuck

**Progetto linguaggi di programmazione – A.A. 2024/2025**  
Autore: Simone Mattioli – VR486911  
Università degli Studi di Verona

---

## 📌 Descrizione

MyLang è un linguaggio interpretato progettato da zero, conforme ai 12 requisiti obbligatori del progetto d'esame.  
È stato realizzato usando **ANTLR4** per la generazione del lexer/parser e **Java** per l'interprete.

La particolarità di MyLang è il supporto integrato al linguaggio **Brainfuck**, eseguibile inline con la sintassi:

```mylang
sly {
    ++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.
    <<+++++++++++++++.>.+++.------.--------.>+.>.
} arnold;
```

---

## ✅ Specifiche richieste (soddisfatte)

| #  | Requisito                                      | Supportato |
|----|------------------------------------------------|------------|
| 1  | Operazioni base `+ - * / % ^`                 | ✅         |
| 2  | Non-determinismo `{...} ND [...] ND [...]`     | ✅         |
| 3  | Ciclo `while` o `do-while`                    | ✅         |
| 4  | Ciclo `for`                                   | ✅         |
| 5  | `if`, `if-else`                               | ✅         |
| 6  | `input()` e `print()`                         | ✅         |
| 7  | Stringhe + `str()`                            | ✅         |
| 8  | Float                                          | ✅         |
| 9  | Liste / Array                                  | ✅         |
| 10 | Variabili dinamiche                           | ✅         |
| 11 | Funzioni senza parametri                      | ✅         |
| 12 | `sly{ ... }arnold;` per codice Brainfuck      | ✅         |

---

## 🧱 Architettura del Progetto

```
elaborato_linguaggi/
├── src/
│   └── myLang/
│       ├── GrammaticaLexer.g4
│       ├── GrammaticaParser.g4
│       ├── EvalVisitor.java
│       ├── BrainfuckInterpreter.java
│       ├── Conf.java
│       ├── FunctionRegistry.java
│       └── Main.java
├── gen/
├── INPUTS/
└── lib/
```

---

## 🛠️ Scelte Implementative

- **ANTLR4** per il parsing.
- **Java** per l’esecuzione tramite visitor pattern.
- Scope gestito con `Map<String, Object> memory`.
- Tipizzazione dinamica.
- Return con eccezioni.
- `Conf` per nastro Brainfuck separato.

---

## 🧠 Brainfuck: Integrazione

Il linguaggio supporta blocchi `sly{...}arnold;` per scrivere codice Brainfuck inline.

### ➤ Parser & Lexer

- Modalità `BF` nel lexer.
- Regole `bfProgram`, `bfCommand`, `bfLoop` nel parser.

### ➤ Esecuzione

```java
Conf conf = new Conf();
BrainfuckInterpreter bfInterp = new BrainfuckInterpreter(conf);
bfInterp.visit(ctx.bfProgram());
```

---

## 🧪 Esempi Demo

```mylang
fun books() {
    var b = input();
    while(b < 42 + input()) {
        b = input();
    }
    ret b;
}
print("Books: " ++ str(books()));
```

```mylang
sly {
    ++++++++++[>+++++++>++++++++++>+++>+<<<<-]
    >++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.
} arnold;
```

---


## 📁 File di Input

Usa `input.txt` o i file in `/INPUTS/`:
- `array.txt`
- `funzione.txt`
- `brainfuck.txt`
- `non determinismo.txt`
- ecc.

---

## 📄 Licenza

Sviluppato a scopo didattico. Tutti i diritti riservati all’autore.

---

## 📧 Dettagli sulle lezioni/corso
🔎 → [vedi README_GENERALE.md](README_GENERALE.md)


Simone Mattioli – VR486911
