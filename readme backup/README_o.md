# 🧠 MyLang – Linguaggio Interpretato + Brainfuck

**Progetto linguaggi di programmazione – A.A. 2024/2025**  
Autore: Simone Mattioli – VR486911  
Università degli Studi di Verona

---

## 📌 Descrizione

MyLang è un linguaggio interpretato progettato da zero, conforme ai 12 requisiti obbligatori del progetto d'esame.  
È stato realizzato usando **ANTLR4** per la generazione del lexer/parser e **Java** per l'interprete.

La particolarità di MyLang è il supporto integrato al linguaggio **Brainfuck**, eseguibile inline con `sly{ ... }arnold;`.

---

## ✅ Caratteristiche principali implementate

| #  | Caratteristica | Dettagli |
|----|----------------|----------|
| 1  | Operazioni aritmetiche | `+ - * / % ^` con precedenza e associatività corretta, solo su numeri |
| 2  | Stringhe e concatenazione | `++` e `str(...)`, separazione netta tra espressioni aritmetiche e testuali |
| 3  | Controllo di flusso | `if`, `if-else`, `while`, `for` |
| 4  | Input/Output | `input()`, `print()` |
| 5  | Non determinismo | `{ ... } ND [ ... ]` con selezione random |
| 6  | Tipi numerici | Supporto a `INT` e `FLOAT`, coerenti in tutte le operazioni |
| 7  | Array | Dichiarazione `var a[2] = ...`, accesso/modifica con `a[i] = x` e `a[i]` |
| 8  | Scope e variabili | Ogni funzione ha un ambiente locale `Map<String, Object>` isolato |
| 9  | Funzioni | Definite con `fun name() { ... }`, senza parametri ma con supporto a `ret` |
| 10 | Return | Gestito con eccezione `ReturnValue`, che trasporta il valore |
| 11 | Memoria | Stack di ambienti locali, accesso alle globali fuori dallo scope corrente |
| 12 | Brainfuck | Interpretato inline tramite regole lessicali separate in modalità `BF` |

---

## 🧠 Scelte implementative chiave

- **Memory model:** ogni chiamata a funzione crea un nuovo `Map<String, Object>`, pushato su uno `Stack`.  
  Alla `ret` viene effettuato il `pop()` e si sincronizzano solo le variabili globali modificate.

- **Array dinamici:** implementati con `ArrayList<Object>`. Se l’indice è oltre la lunghezza, viene espanso automaticamente con `0`.

- **Return semantico:** se una funzione non restituisce esplicitamente con `ret`, il valore di default è `0.0f`, evitando eccezioni su `null`.

- **Input condiviso:** Scanner `System.in` è definito una sola volta all'inizio dell’interprete per evitare blocchi.

- **Funzioni senza parametri:** si è scelto di rispettare il requisito minimo, ma lasciando il design estendibile a parametri in futuro.

- **Error handling:** `toNumber` lancia eccezioni chiare se riceve tipi errati, prevenendo errori silenziosi.

---

## 🔧 Normalizzazione input

In `Main.java`, durante la lettura del sorgente:

```java
String norm = raw
    .replace('–', '-')    // En-dash → -
    .replace('“', '"')         // Virgolette curve sinistra → "
    .replace('”', '"');        // Virgolette curve destra → "
```

Questa normalizzazione è minima, ma sufficiente a evitare parsing fallito causato da editor "intelligenti".

---

## 📜 Struttura grammatica (estratto)

```antlr
expr : arithExpr # exprArith | strExpr # exprStr ;

strExpr : exprStrPart (CONCAT exprStrPart)* # concatExpr ;

exprStrPart
    : STR_KW LPAREN arithExpr RPAREN        # toStrInStrExpr
    | STRING                                # stringInStrExpr
    | ID                                    # idInStrExpr
    | INPUT LPAREN RPAREN                   # inputInStrExpr
    | LPAREN strExpr RPAREN                 # parensStrExpr ;

arithExpr : compExpr ;
addExpr : multExpr ((PLUS | MINUS) multExpr)* # addExprOp ;
multExpr : powExpr ((MUL | DIV | MOD) powExpr)* # mulExprOp ;
powExpr : unaryExpr (POW powExpr)? # powExprOp ;
```

---

## 🧪 Test funzionali – esempi consigliati

**Concatenazione e stringa**
```mylang
print("Library -> 1, Bookshop -> 2.");
```

**Funzione con input e ritorno**
```mylang
fun books() {
    print("How many books do you read in a year??");
    var books = input();
    while (books < (42 + 42 - 42 + input())) {
        books = input();
    }
    ret books;
}
```

**Chiamata funzione + uso**
```mylang
var choice = input();
var total = books();
print("Choice: " ++ str(choice) ++ ", Books: " ++ str(total));
```

---

## 💻 Esecuzione

```bash
antlr4 GrammaticaLexer.g4 GrammaticaParser.g4 -visitor -package myLang -o gen
javac -cp lib/antlr4-runtime-4.13.2.jar $(find src -name '*.java') $(find gen -name '*.java')
java  -cp lib/antlr4-runtime-4.13.2.jar:src:gen myLang.Main file.myl
```

---

## 📄 Licenza

Sviluppato a scopo didattico. Tutti i diritti riservati all’autore.