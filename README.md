![Linguaggi - UniVR](https://img.shields.io/badge/Linguaggi-UniVR-blueviolet?style=for-the-badge&logo=bookstack&logoColor=white)

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

## 🧠 Variabili Globali di EvalVisitor

Questa sezione descrive le principali variabili d’istanza presenti nella classe `EvalVisitor`, spiegando il loro ruolo nella gestione dello scope, delle funzioni e dell’esecuzione del linguaggio MyLang.

---

### 📚 `Salvataggio Ambienti`

```java
private Deque<Map<String, Object>> callStack = new ArrayDeque<>();
```

#### 📌 Scopo:
Rappresenta **la pila degli ambienti (scope)**. Ogni `Map<String, Object>` è uno scope attivo:

- Quando entri in una funzione: `callStack.push(nuovoScope)`
- Quando esci: `callStack.pop()`
- Le variabili vengono cercate **a partire dal frame corrente** (top dello stack) e risalendo

#### 📍 Uso:
- `getVariable(name)` scorre gli scope per risolvere una variabile
- `visitAssignStmt()` e `visitVarDecl()` modificano lo scope in cima allo stack

---

### 📚 `Salvataggio Funzioni`

```java
private final Map<String, GrammaticaParser.FunDeclContext> functions = new HashMap<>();
```

#### 📌 Scopo:
È il **registro delle funzioni dichiarate**.

- La chiave è il nome della funzione (`ID`)
- Il valore è il `FunDeclContext`, cioè il sottoalbero del parse tree associato

#### 📍 Uso:
- Popolato in `visitFunDecl()`
- Consultato in `visitCallExpr()` per ottenere il corpo da eseguire

---

### 🔢 `Non Determinismo`

```java
private Random random = new Random();
```

#### 📌 Scopo:
Serve per il **costrutto non-deterministico** (`ND`), che esegue uno dei blocchi a caso.

#### 📍 Uso:
In `visitNonDetStmt()`, scegli a caso se eseguire il blocco sinistro o quello destro:

```java
if (random.nextBoolean()) {
    visit(ctx.block(0));
} else {
    visit(ctx.block(1));
}
```

---

### 🧮 `ReturnException` (classe usata)

> Anche se non è una variabile, è fondamentale nella logica delle funzioni:

- Lanciata in `visitRetStmt()` per interrompere l’esecuzione e portare un valore di ritorno
- Intercettata in `visitCallExpr()` per recuperare il valore ritornato
- Permette una gestione del flusso più pulita rispetto a flag o return manuali

---

## 🛠️ Scelte Implementative

### 🧮 Tipi e Operazioni

- **Tipi supportati**: interi, float, stringhe, array (come liste).
- **Somma (`+`)**: opera solo su numeri. Se almeno uno degli operandi non è numerico, viene sollevata un’eccezione.
- **Concatenazione (`++`)**: opera solo su stringhe e supporta concatenazione multipla (`a ++ b ++ c`). Il parsing è fatto in `strExpr`, separato da `arithExpr` per garantire che le stringhe non finiscano nei rami aritmetici.
- **Conversione a stringa (`str(...)`)**: è un’espressione stringa e accetta un’espressione aritmetica come argomento. Corretta gestione nel visitor `visitToStrInStrExpr`.

### 🔠 Stringhe e Input

- **Stringhe**: sono valori primitivi, delimitati da doppi apici (`"..."`), gestite separatamente dalle espressioni aritmetiche.
- **Input utente (`input()`)**: restituisce una stringa. Se viene passato in un contesto aritmetico (es. `input() + 5`), l’interprete solleva un errore a runtime.

### 🧮 Espressioni Aritmetiche

- Espressioni con precedenza: `^` (potenza), `* / mod`, `+ -`, confronti (`< > == != <= >=`)
- Ogni livello è implementato secondo le regole di precedenza e associatività.
- Conversione a numero (`toNumber`) viene invocata solo quando l’operatore effettivamente lo richiede.

---

## ⚙️ Gestione dello Scoping in MyLang

Il linguaggio MyLang implementa un sistema di scoping **a pila dinamica** e sincronizzazione controllata verso lo scope globale.

---

### 🔁 Stack degli Scope – `callStack`

```java
private Deque<Map<String, Object>> callStack = new ArrayDeque<>();
```

- Ogni `Map<String, Object>` rappresenta uno scope attivo.
- Lo scope in cima (top) rappresenta l’ambiente **corrente** (es. corpo di una funzione).
- Lo scope in fondo (last) è l’ambiente **globale**.

Le variabili vengono cercate **a partire dal top** e risalendo verso il globale.

---

### 📌 Funzione `getVariable(String name)`

```java
private Object getVariable(String name) {
    for (Map<String, Object> scope : callStack) {
        if (scope.containsKey(name)) return scope.get(name);
    }
    throw new RuntimeException("Variabile non dichiarata: " + name);
}
```

- Cerca una variabile a partire dallo scope più recente.
- Se non trovata in nessuno scope, lancia un’eccezione.
- Questo approccio consente **shadowing** (una variabile locale può mascherare una globale).

---

### 🧠 Dichiarazioni Locali – `declaredStack`

```java
private Deque<Set<String>> declaredStack = new ArrayDeque<>();
```

- Ogni funzione inserisce nel `declaredStack` l’insieme dei nomi **dichiarati localmente** (con `var`).
- Serve a distinguere le modifiche globali da quelle puramente locali.

---

### 🔄 Sincronizzazione con lo Scope Globale – `syncWithGlobal(...)`

```java
private void syncWithGlobal(Map<String, Object> newScope) {
    Map<String, Object> globalScope = callStack.getLast();
    Set<String> declaredLocally = declaredStack.pop();

    for (Map.Entry<String, Object> entry : newScope.entrySet()) {
        String var = entry.getKey();
        if (globalScope.containsKey(var) && !declaredLocally.contains(var)) {
            globalScope.put(var, entry.getValue());
        }
    }
}
```

#### 📌 Cosa fa:
- Alla fine di una funzione, prende lo scope appena uscito (`newScope`).
- Per ogni variabile:
  - Se esiste nello scope globale
  - E **non è stata dichiarata localmente**
  - Allora la modifica viene sincronizzata (copiata) nel globale.

---

### 🧪 Esempio

```mylang
var x = 1;

fun test() {
  x = 5;        // Modifica la variabile globale
  var y = 100;  // y è locale e non tocca lo scope globale
}

test();
print(x);  // Stampa 5
print(y);  // Errore: y non esiste nello scope globale
```

---

### 🧩 Vantaggi dell'approccio

- ✅ Isolamento garantito tra ambienti (ogni funzione ha il suo scope)
- ✅ Supporto al shadowing
- ✅ Possibilità di modificare variabili globali in modo controllato
- ❌ Nessun accesso diretto da una funzione allo scope di un’altra funzione

---

## 🔧 Gestione delle Funzioni in MyLang

- **Dichiarazione**: `fun nome() { ... }`
- **Nessun parametro** supportato (per semplicità).
- **Return** gestito via eccezione lanciata in `visitRetStmt` e catturata in `visitCallExpr`, per evitare propagazione manuale del flag di ritorno.
---

### 🧾 Sintassi

**Dichiarazione:**
```mylang
fun nomeFunzione() {
    // corpo
    ret espressione;
}
```

**Chiamata:**
```mylang
nomeFunzione();
```

---

### 🧠 Implementazione nel Visitor

#### 1. **Registrazione delle funzioni**

Durante la visita del nodo `funDecl`, ogni funzione viene registrata nel `FunctionRegistry` (una mappa `Map<String, FunDeclContext>`), associando il nome alla sua definizione.


```java
@Override
public Object visitFunDecl(GrammaticaParser.FunDeclContext ctx) {
    String functionName = ctx.ID().getText();
    visitFunDecl.put(functionName, ctx);
    return null;
}
```

---

#### 2. **Chiamata di funzione (`visitCallExpr`)**

Quando si richiama una funzione, l’interprete:

- Recupera il contesto (`FunDeclContext`) dal registro
- Crea un **nuovo ambiente (scope)** con una `Map<String, Object>` vuota
- Visita il blocco della funzione
- Intercetta l’eccezione `ReturnException` per ottenere il valore ritornato
- Ripristina lo scope e lo stato precedente

```java
@Override
    public Object visitCallExpr(GrammaticaParser.CallExprContext ctx) {
        String fname = ctx.ID().getText();
        GrammaticaParser.FunDeclContext fctx = functions.get(fname);
        if (fctx == null) throw new RuntimeException("Funzione non definita: " + fname);

        Map<String, Object> newScope = new HashMap<>();
        Set<String> declaredLocally = new HashSet<>();

        callStack.push(newScope);
        declaredStack.push(declaredLocally);

        try {
            for (var stmt : fctx.block().statement()) {
                visit(stmt);
            }
        } catch (ReturnValue rv) {
            callStack.pop();
            syncWithGlobal(newScope);
            return rv.value;
        }

        callStack.pop();
        syncWithGlobal(newScope);
        return 0f;
    }
```

---

#### 3. **Gestione del `ret` (`visitRetStmt`)**

Il valore ritornato da una funzione viene gestito con una `ReturnException`: Viene lanciata l’eccezione per uscire dal blocco corrente e restituire il valore.

```java
@Override
public Object visitRetStmt(GrammaticaParser.RetStmtContext ctx) {
    Object returnValue = visit(ctx.expr());
    throw new ReturnException(returnValue);
}
```

---

### 🧠 Memoria e Scope

- Ogni funzione ha un **ambiente locale indipendente**, creato con una `HashMap` al momento della chiamata.
- Alla fine della funzione, l’ambiente viene rimosso dal `callStack`, ripristinando quello precedente.
- Le variabili globali possono essere lette e modificate (se non shadowate da locali).

---

### 🚫 Limitazioni attuali

- ❌ Le funzioni **non accettano parametri**.
- ❌ Possibile miglioramento controllando se sono dentro o fuori da una funzione per poter fare ret [ e gestire meglio l'eccezione ]
- ✅ È possibile accedere a variabili globali se non mascherate da dichiarazioni locali.

---

### 🎮 Altri costrutti

- **Controllo di flusso**: `if`, `if-else`,`while`, `for`, `nonDet`, gestiti con blocchi ben delimitati (`{}`).
- **Brainfuck (`sly`)**: supporto integrato per eseguire programmi embedded con sintassi dedicata, incluso loop e comandi base `<>+-.,[]`.

---

## ❗ Errori a Runtime Gestiti

Durante l'esecuzione di un programma scritto in MyLang, l'interprete può sollevare eccezioni in presenza di errori di tipo o uso scorretto delle strutture. Di seguito sono elencati i principali errori gestiti dinamicamente in `EvalVisitor`.

### ❌ Uso scorretto di operatori

```mylang
var s = "10";
var x = s + 5;
```

**Errore:**
```text
RuntimeException: Uso scorretto di + con tipi non numerici: String, Integer
```

---

### ❌ Conversione forzata a numero non valida

```mylang
var s = "ciao";
var x = s ^ 2;
```

**Errore:**
```text
RuntimeException: Stringa non numerica in toNumber(): "ciao"
```

---

### ❌ Accesso a variabile non dichiarata

```mylang
print(x);
```

**Errore:**
```text
RuntimeException: Variabile non dichiarata: x
```

---

### ❌ Funzione non definita

```mylang
foo();  // funzione non dichiarata
```

**Errore:**
```text
RuntimeException: Funzione non definita: foo
```

---

### ➤ Parser & Lexer

L'integrazione di Brainfuck in MyLang è stata ottenuta **separando le regole lessicali (lexer) da quelle sintattiche (parser)**, come richiesto da ANTLR4 per supportare le **modalità multiple di scansione dei token**.

---

#### 🧾 Modalità `BF` nel Lexer

- Quando il lexer incontra la sequenza `sly {`, viene attivata la **modalità `BF`** dinamicamente tramite la regola:

  ```antlr
  SLY_START : 'sly' '{' -> pushMode(BF);
  ```

- La modalità `BF` consente di **sospendere la tokenizzazione del linguaggio principale** e interpretare solo gli 8 simboli validi del linguaggio Brainfuck (`+`, `-`, `<`, `>`, `[`, `]`, `.`, `,`), con regole come:

  ```antlr
  mode BF;
  BF_PLUS  : '+';
  BF_MINUS : '-';
  BF_LT    : '<';
  BF_GT    : '>';
  BF_DOT   : '.';
  BF_COMMA : ',';
  BF_LBRAK : '[';
  BF_RBRAK : ']';
  BF_RBRACE : '}' -> popMode;  // termina la modalità BF
  ```

- Qualsiasi altro carattere in questa modalità (es. spazi, newline, commenti) viene ignorato tramite:

  ```antlr
  BF_OTHER : . -> skip;
  ```

---

#### 🧠 Regole nel Parser

Nel file `GrammaticaParser.g4`, un blocco Brainfuck viene riconosciuto con una **produzione sintattica dedicata**:

```antlr
slyStmt : SLY_START bfProgram BF_RBRACE ARNOLD SEMICOLON? ;
```

Dove:

- `SLY_START` è il token corrispondente a `sly {` e attiva il lexer mode `BF`.
- `bfProgram` rappresenta il corpo del codice Brainfuck.
- `BF_RBRACE` chiude il blocco e ripristina il lexer alla modalità normale.
- `ARNOLD` è un token obbligatorio dopo il blocco Brainfuck, e può essere seguito da un `;`.

---

##### 📘 Dettaglio: `bfProgram` e `bfCommand`

- Il blocco `bfProgram` è una lista di comandi Brainfuck:

  ```antlr
  bfProgram : bfCommand* ;
  ```

- Ogni `bfCommand` rappresenta un’istruzione Brainfuck o un loop annidato:

  ```antlr
  bfCommand
      : BF_LT                         # BfLt
      | BF_GT                         # BfGt
      | BF_PLUS                       # BfPlus
      | BF_MINUS                      # BfMinus
      | BF_DOT                        # BfDot
      | BF_COMMA                      # BfComma
      | BF_LBRAK bfProgram BF_RBRAK   # BfLoop
      ;
  ```

---

### ✅ Vantaggi dell’approccio

- ✅ Permette di **incorporare Brainfuck inline** in qualsiasi punto del codice MyLang.
- ✅ L’interprete di Brainfuck è completamente separato (`BrainfuckInterpreter.java`), mantenendo pulita l’architettura.
- ✅ La modalità `BF` evita che simboli Brainfuck entrino in conflitto con il lessico di MyLang.

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
5
```

---

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
100
```

---

---

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
100
200
```

---

### 🔹 Ciclo for

**Input:**
```mylang
for ( var j = 1; j <= 3; j = j + 1 ) {
  print(j);
}
```

**Output atteso:**
```text
1
2
3
```

---

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

---

### 🔹 Concatenazione stringhe

**Input:**
```mylang
var s1 = "Hello";
var s2 = 10 + 20;
print(s1 ++ " " ++ str(s2) ++ "!");
```

**Output atteso:**
```text
HelloWorld 30!
```

---

### 🔹 Float

**Input:**
```mylang
print(3.14);
print(10.0 / 4.0);
print(2 ^ 3.0);
```

**Output atteso:**
```text
3.14
2.5
8.0
```

---

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
10
```

---

### 🔹 Scoping Delle Variabili ( lettura variabili globali )

**Input:**
```mylang
var x = 1;
fun foo() { x = 2; }
foo();
print(x);
```

**Output atteso:**
```text
2
```

---

### 🔹 Scoping Delle Variabili ( modifica di variabili globali se non dichiarate nell'ambiente locale )

**Input:**
```mylang
var x = 1;
fun foo() { var x = 2; }
foo();
print(x);  // deve stampare 1  (la modifica non “passa” fuori)
```

**Output atteso:**
```text
1
```
---

### 🔹 Input e print

**Input:**
```mylang
print("Inserisci un numero:");
var x = input();
print(x * 2);
```

**Output atteso:**
```text
> 3

6
```

---

### 🔹 Non Determinismo

**Input:**
```mylang
{ print(1); } ND [ print(2); ];
```

**Output atteso:**
```text
1 oppure 2
```

---

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
5
6
30
5
1
32
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

## 📧 Dettagli sulle lezioni/corso
🔎 → [vedi README_GENERALE.md](README_GENERALE.md)

Simone Mattioli – VR486911

---

## 📄 Licenza

Sviluppato a scopo didattico. Tutti i diritti riservati all’autore.
