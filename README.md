
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
| Regola `whileStmt` + `EvalVisitor.visitWhileStmt()` che valuta la condizione dinamicamente           | 3  | Ciclo `while`                      | ✅         |
| Regola `forStmt` + `visitForStmt()` con valutazione di init, condizione e update                     | 4  | Ciclo `for`                                     | ✅         |
| Regola `ifStmt` + `EvalVisitor.visitIfStmt()` che gestisce blocchi condizionali                      | 5  | `if`, `if-else`                                 | ✅         |
| `print()` e `input()` sono gestite direttamente come `BuiltinFunction` nel `FunctionRegistry`        | 6  | `input()` e `print()`                           | ✅         |
| Concatenazione stringhe con `++`, `str()` implementato in `EvalVisitor.visitStrExpr()`               | 7  | Stringhe + `str()`                              | ✅         |
| Supporto `FLOAT` in lexer + casting/aritmetica in `EvalVisitor`                                      | 8  | Float                                            | ✅         |
| Array definiti tramite `ID [expr]`, accesso e modifica con `arrayAccess` e `assignStmt`              | 9  | Array                                    | ✅         |
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

- **ARRAY** come una Lista di oggetti generici in memoria.
- **Funzioni** non accettano parametri, ma supportano chiamata, scope locale e return tramite eccezione.
- **Ritorno delle funzioni** È lanciata in visitRetStmt, e intercettata in visitCallExpr, Così si evita di dover propagare manualmente lo stato “ritorno già effettuato” in tutti i visit
- **Memoria** dove Ogni ambiente è una Map<String, Object>, Quando una funzione viene chiamata, si crea un nuovo memory, poi si ripristina quello precedente.

---

### ➤ Normalizzazione INPUT dal Main

Il file `Main.java` contiene una **fase di normalizzazione leggera dell’input**, focalizzata esclusivamente sulla **pulizia di alcuni caratteri Unicode errati o indesiderati** che potrebbero compromettere la fase di parsing.

---

#### ⚙️ Dettaglio della normalizzazione effettiva

Durante la lettura del file di input, vengono effettuate solo **tre sostituzioni**:

```java
String norm = raw
    .replace('\u2013', '-')    // En-dash → trattino normale
    .replace('“', '"')         // Virgolette curve sinistra → virgolette ASCII
    .replace('”', '"');        // Virgolette curve destra → virgolette ASCII
```

Non vengono eseguite altre modifiche, come l'aggiunta automatica di `;` o la sistemazione di spaziature ( Gestite nella grammatica ).

---

#### 📌 Perché questa normalizzazione?

- Alcuni editor di testo (come Word, Pages o note in PDF) **inseriscono automaticamente caratteri Unicode** al posto di simboli ASCII.
- Le **virgolette curve** e i **trattini lunghi** (`–`) possono far fallire il parsing ANTLR, perché non corrispondono ai token previsti dalla grammatica.
- La correzione anticipata di questi caratteri **assicura un parsing corretto** e previene errori difficili da individuare.

---

#### 🧪 Esempio

| Input nel file originale     | Dopo normalizzazione         |
|------------------------------|-------------------------------|
| `print(“Hello”)`             | `print("Hello")`             |

---

#### ✅ Conclusione

La normalizzazione implementata in `Main.java` è **minimale ma strategica**:  
evita errori di parsing dovuti a caratteri tipografici errati **senza alterare la struttura sintattica** o i contenuti logici del programma.

---

### ➤ Parser & Lexer

L'integrazione di Brainfuck in MyLang è stata ottenuta **separando le regole lessicali (lexer) da quelle sintattiche (parser)**, come richiesto da ANTLR per supportare le **modalità multiple di scansione dei token**.

#### 🧾 Modalità `BF` nel Lexer

- Quando il lexer incontra la sequenza `sly {`, viene attivata la **modalità `BF`** tramite la regola:
  ```antlr
  SLY_START : 'sly' '{' -> pushMode(BF);
  ```

- In modalità `BF`, vengono riconosciuti **solo gli 8 simboli validi** del linguaggio Brainfuck (`+`, `-`, `<`, `>`, `[`, `]`, `.`, `,`), con regole come:
  ```antlr
  mode BF;
  BF_PLUS : '+';
  BF_MINUS : '-';
  ...
  BF_RBRACE : '}' -> popMode;  // termina la modalità BF
  ```

- Qualsiasi altro carattere (spazi, newline, commenti) viene ignorato usando:
  ```antlr
  BF_OTHER : . -> skip;
  ```

---

#### 🧠 Regole nel Parser

Nel file `GrammaticaParser.g4`, il blocco Brainfuck viene riconosciuto con una **produzione specifica**:

```antlr
slyStmt : SLY_START bfProgram BF_RBRACE ARNOLD SEMICOLON ;
```

Dove:
- `SLY_START` è il token `sly {` che attiva la modalità `BF`.
- `bfProgram` rappresenta il corpo del codice Brainfuck.
- `BF_RBRACE` chiude il blocco e ripristina il lexer alla modalità standard.

##### 📘 Dettaglio: `bfProgram` e `bfCommand`

- `bfProgram` è una lista di comandi Brainfuck:
  ```antlr
  bfProgram : bfCommand* ;
  ```

- `bfCommand` gestisce i singoli comandi e i loop annidati:
  ```antlr
  bfCommand
      : BF_LT         # BfLt
      | BF_GT         # BfGt
      | BF_PLUS       # BfPlus
      | BF_MINUS      # BfMinus
      | BF_DOT        # BfDot
      | BF_COMMA      # BfComma
      | BF_LBRAK bfProgram BF_RBRAK  # BfLoop
      ;
  ```

Questo approccio permette di:
- **Incorporare Brainfuck in qualsiasi punto del linguaggio** (tramite `slyStmt`).
- **Isolare la logica di interpretazione** nella classe `BrainfuckInterpreter`, separata dal resto dell’interprete.

---

## 🧪 Test di Verifica – MyLang

Questa sezione documenta i test eseguiti durante lo sviluppo del linguaggio MyLang.

### 🔹 Array

**Input:**
```mylang
var a[2] = 10;
print(a[2]);
a[0] = 5;
print(a[0]);
```

**Output atteso:**
```text
10
10
```

### 🔹 Blocco condizionale if else

**Input:**
```mylang
if ( 2 < 3 ) {
  print(100);
} else {
  print(200);
}
```

**Output atteso:**
```text
vero
```

### 🔹 Blocco condizionale solo if

**Input:**
```mylang
if ( 2 < 3 ) {
  print(100);
}
print(200);
```

**Output atteso:**
```text
condizione vera
```

### 🔹 Ciclo for

**Input:**
```mylang
for ( var j = 1; j <= 3; j = j + 1 ) {
  print(j);
}
```

**Output atteso:**
```text
0
1
2
3
4
```

### 🔹 Ciclo while

**Input:**
```mylang
var i = 0;
while ( i < 5 ) {
  print(i);
  i = i + 1;
}
```

**Output atteso:**
```text
0
1
2
3
4
```

### 🔹 Concatenazione stringhe

**Input:**
```mylang
var s1 = "Hello";
var s2 = str(10 + 20);
print(s1 ++ " " ++ s2 ++ "!");
```

**Output atteso:**
```text
HelloWorld42
```

### 🔹 Float

**Input:**
```mylang
print(3.14);
print(10.0 / 4.0);
print(2 ^ 3.0);
```

**Output atteso:**
```text
5.5
2.75
8.25
```

### 🔹 Funzione con return

**Input:**
```mylang
fun inc() {
  ret 1 + 1;
}
fun sumTen() {
  ret inc() + 8;
}
print(sumTen());
```

**Output atteso:**
```text
8
```

### 🔹 Input e print

**Input:**
```mylang
print("Inserisci un numero:");
var x = input();
print(x * 2);
```

**Output atteso:**
```text
Inserisci un valore:
42
Hai inserito: 42
```

### 🔹 Non Determinismo

**Input:**
```mylang
{ print(1); } ND [ print(2); ];
```

**Output atteso:**
```text
1 oppure 2
```

### 🔹 operazioni aritmetiche di Base

**Input:**
```mylang
print(2 + 3);
print(10 - 4);
print(5 * 6);
print(20 / 4);
print(10 % 3);
print(2 ^ 5);
```

**Output atteso:**
```text
```
### 🔹 scope ( lettura di variabile locale )

**Input:**
```mylang
var x = 100;
var y = x + 23;
print(y);
```

**Output atteso:**
```text
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

---

## 📧 Dettagli sulle lezioni/corso
🔎 → [vedi README_GENERALE.md](README_GENERALE.md)

Simone Mattioli – VR486911

---

---

## 📄 Licenza

Sviluppato a scopo didattico. Tutti i diritti riservati all’autore.