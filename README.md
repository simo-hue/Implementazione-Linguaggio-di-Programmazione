
# 🧠 MyLang – Linguaggio Interpretato + Brainfuck

**Progetto linguaggi di programmazione – A.A. 2024/2025**  
Autore: Simone Mattioli – VR486911  
Università degli Studi di Verona

---

## 📌 Descrizione

MyLang è un linguaggio interpretato progettato da zero, conforme ai 12 requisiti obbligatori del progetto d'esame.  
È stato realizzato usando **ANTLR4** per la generazione del lexer/parser e **Java** per l'interprete.

La particolarità di MyLang è il supporto integrato al linguaggio **Brainfuck**, eseguibile inline

---

## ✅ Specifiche richieste

| Implementazione                                                                                      | #  | Requisito                                        | Supportato |
|-------------------------------------------------------------------------------------------------------|----|--------------------------------------------------|------------|
| Operazioni gestite in `EvalVisitor.visitAddExpr`, `visitMulExpr`, ecc., con casting dinamico         | 1  | Operazioni base `+ - * / % ^`                   | ✅         |
| Definito in `nonDetStmt` (parser) e gestito in `EvalVisitor.visitNonDetStmt()` con `Random`          | 2  | Non-determinismo `{...} ND [...] ND [...]`       | ✅         |
| Regola `whileStmt` + `EvalVisitor.visitWhileStmt()` che valuta la condizione dinamicamente           | 3  | Ciclo `while` o `do-while`                      | ✅         |
| Regola `forStmt` + `visitForStmt()` con valutazione di init, condizione e update                     | 4  | Ciclo `for`                                     | ✅         |
| Regola `ifStmt` + `EvalVisitor.visitIfStmt()` che gestisce blocchi condizionali                      | 5  | `if`, `if-else`                                 | ✅         |
| `print()` e `input()` sono gestite direttamente come `BuiltinFunction` nel `FunctionRegistry`        | 6  | `input()` e `print()`                           | ✅         |
| Concatenazione stringhe con `++`, `str()` implementato in `EvalVisitor.visitStrExpr()`               | 7  | Stringhe + `str()`                              | ✅         |
| Supporto `FLOAT` in lexer + casting/aritmetica in `EvalVisitor`                                      | 8  | Float                                            | ✅         |
| Array definiti tramite `ID [expr]`, accesso e modifica con `arrayAccess` e `assignStmt`              | 9  | Liste / Array                                    | ✅         |
| `Map<String, Object> memory` usata per mantenere variabili globali e locali                          | 10 | Variabili dinamiche                             | ✅         |
| Funzioni definite con `funDecl`, registrate in `FunctionRegistry`, gestite in `EvalVisitor`          | 11 | Funzioni senza parametri                        | ✅         |
| Lexer mode `BF`, parser `bfProgram`, visitor `BrainfuckInterpreter`, stato `Conf.java`               | 12 | `sly{ ... }arnold;` per codice Brainfuck        | ✅         |

---

## 🧱 Architettura del Progetto

```
ELABORATO
├── ELABORATO.iml
├── PROGETTO LINGUAGGI.pdf
└── elaborato_linguaggi
    ├── INPUTS
    │   ├── VERIFICHE
    │   │   ├── array
    │   │   ├── blocco condizionale if else
    │   │   ├── blocco condizionale solo if
    │   │   ├── ciclo for
    │   │   ├── ciclo while
    │   │   ├── concatenazione stringhe
    │   │   ├── float
    │   │   ├── funzione con return
    │   │   ├── input e print
    │   │   ├── non determinismo
    │   │   ├── operazioni aritmetiche
    │   │   └── scope globale lettura variabili
    │   ├── array.txt
    │   ├── brainfuck.txt
    │   ├── for.txt
    │   ├── funzione.txt
    │   ├── if.txt
    │   ├── input.txt
    │   ├── non determinismo.txt
    │   └── while.txt
    ├── elaborato_linguaggi.iml
    ├── gen
    │   └── myLang
    │       ├── Grammatica.interp
    │       ├── Grammatica.tokens
    │       ├── GrammaticaBaseVisitor.java
    │       ├── GrammaticaLexer.interp
    │       ├── GrammaticaLexer.java
    │       ├── GrammaticaLexer.tokens
    │       ├── GrammaticaParser.interp
    │       ├── GrammaticaParser.java
    │       ├── GrammaticaParser.tokens
    │       ├── GrammaticaParserBaseListener.java
    │       ├── GrammaticaParserBaseVisitor.java
    │       ├── GrammaticaParserListener.java
    │       ├── GrammaticaParserVisitor.java
    │       └── GrammaticaVisitor.java
    ├── img
    ├── input.txt
    ├── lib
    │   └── antlr4-runtime-4.13.2.jar
    ├── out
    │   └── production
    │       └── elaborato_linguaggi
    ├── primoDemo.txt
    ├── secondoDemo.txt
    ├── src
    │   └── myLang
    │       ├── BrainfuckInterpreter.java
    │       ├── Conf.java
    │       ├── EvalVisitor.java
    │       ├── FunctionRegistry.java
    │       ├── GrammaticaLexer.g4
    │       ├── GrammaticaParser.g4
    │       └── Main.java
    ├── struttura.txt
    └── updates.txt

13 directories, 50 files

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
{ print(“Buy more, more books!”) } ND [ { var books = input();
print(“Buy ” ++ str(books ^ 4) ++ “ books” ++ “!! ;)”) } ND
[ print(“Buy 42 books!”) ]]
```

```mylang
fun books(){
print(“How many books do you read in a year??”);
var books = input();
while( books < ( 42 + 42 – 42 + input() ) ){
books = input();
}
ret books;
}
fun brainfuck(){
sly{ >
+ +
+ +
[ < + +
+ +
+ + + +
> - ] >
+ + + + + + + +
[ >
+ + + +
< - ] >
> + + > > > + >
> > + <
< < < < < < < <
< [ - [ - > + <
] > [ - < + > > > . < < ] > > >
[ [
- > + +
+ + + +
+ + [ > + + + +
< - ] >
. < < [ - > + <
] + > [ - > + +
+ + + + + + + + < < + > ] > . [
- ] > ]
] + < < < [ - [
- > + < ] + > [
- < + > > > - [ - > + < ] + + >
[ - < - > ] < <
< ] < < < < ] + + + + + + + + +
+ . + + + . [ - ] < ] + + + + +
}arnold
}
print(“Library → 1, Bookshop → 2.”);
var books = input();
var bOOks = books();
print(“Choice: ” ++ str(books) ++ “, Books: “ ++ str(bOOks));
print(“Brainfuck: “);
brainfuck();
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
