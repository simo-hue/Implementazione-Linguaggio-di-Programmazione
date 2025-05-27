
# 📚 MyLang – README aggiornato (maggio 2025)

**Progetto Laboratorio Linguaggi di Programmazione – A.A. 2024/2025**  
Autore: Simone Mattioli · matricola VR486911  
Università degli Studi di Verona

---

## ✨ Novità principali (aggiornamento 27 maggio 2025)

| Modifica | Descrizione sintetica |
|----------|-----------------------|
| **Separazione fra espressioni aritmetiche e testuali** | Le stringhe non attraversano più i rami numerici: eliminate definitivamente le eccezioni *«Stringa non numerica in toNumber()»*. |
| **Etichette univoche** | Ogni alternativa nel parser possiede una label unica (`#…`) diversa dai nomi delle regole – niente più errori ANTLR 123/124. |
| **Grammatica semplificata** | `atomExpr` non contiene più `STRING`; i literal stringa vivono solo in `exprStrPart`. |
| **Visitor allineato** | Metodi aggiunti: `visitToStrInStrExpr`, `visitStringInStrExpr`, `visitParensStrExpr`; `visitConcatExpr` ora itera su `exprStrPart`. |
| **Scanner unico per input** | Un solo `java.util.Scanner` condiviso, evitando dead‑lock su stdin. |
| **Normalizzazione Unicode minima** | Sostituzione di EN‑dash e virgolette “smart” in `Main.java`. |

---

## 🗺️ Struttura del progetto

```text
src/myLang
├── Main.java                 # entry‑point
├── GrammaticaLexer.g4        # token + modalità Brainfuck
├── GrammaticaParser.g4       # parser aggiornato
├── EvalVisitor.java          # interprete MyLang
├── BrainfuckInterpreter.java # interprete Brainfuck
└── Conf.java                 # stato macchina Brainfuck
```

---

## 🧩 Estratto della grammatica

```antlr
expr
    : arithExpr              # exprArith
    | strExpr                # exprStr
    ;

strExpr
    : exprStrPart (CONCAT exprStrPart)*     # concatExpr
    ;

exprStrPart
    : STR_KW LPAREN arithExpr RPAREN        # toStrInStrExpr
    | STRING                                # stringInStrExpr
    | ID                                    # idInStrExpr
    | INPUT LPAREN RPAREN                   # inputInStrExpr
    | LPAREN strExpr RPAREN                 # parensStrExpr
    ;

arithExpr   : compExpr ;

addExpr     : multExpr ((PLUS|MINUS) multExpr)*  # addExprOp ;
multExpr    : powExpr  ((MUL|DIV|MOD) powExpr)* # mulExprOp ;
powExpr     : unaryExpr (POW powExpr)?          # powExprOp ;
unaryExpr   : MINUS unaryExpr # unaryMinus | atomExpr # toAtom ;

atomExpr
    : ID LPAREN RPAREN                # callExpr
    | ID LBRACK expr RBRACK           # arrayAccess
    | INPUT LPAREN RPAREN             # inputExpr
    | STR_KW LPAREN arithExpr RPAREN  # toStrExpr
    | ID                              # idExpr
    | FLOAT                           # floatExpr
    | INT                             # intExpr
    | LPAREN expr RPAREN              # parensExpr
    ;
```

> **Nota**: il literal `STRING` appare solo in `exprStrPart`, quindi non finirà mai sotto `toNumber()`.

---

## 🔨 Dettagli implementativi del Visitor

| Metodo | Ruolo |
|--------|-------|
| `visitConcatExpr` | Concatena in ordine left‑assoc i risultati di `exprStrPart`, forzando `.toString()` |
| `visitToStrInStrExpr` | Converte un valore numerico in stringa all’interno di un’espressione testuale |
| `visitStringInStrExpr` | Restituisce il literal senza virgolette |
| `visitAddExprOp`, `visitMulExprOp`, `visitPowExprOp` | Eseguono calcoli su `float` (via `toNumber`) – ora ricevono solo numeri |

`toNumber(Object)` rimane invariato ma non vedrà più stringhe.

---

## 🧪 Test consigliati

| Caso | Sequenza valori digitati | Books che ritorna | Choice |
|------|-------------------------|-------------------|--------|
| Nessuna iterazione while | `2  55  10`      | 55  | 2 |
| Una iterazione           | `1  10  100  200  0` | 200 | 1 |
| Due iterazioni           | `1  20  0  30  5  60  10` | 60  | 1 |

> Dettaglio: ogni `input()` stampa `>`; vedi README originale per la sequenza esatta.

---

## ▶️ Build veloce

```bash
antlr4 GrammaticaLexer.g4 GrammaticaParser.g4 -visitor -package myLang -o gen
javac -cp lib/antlr4-runtime-4.13.2.jar $(find src -name '*.java') $(find gen -name '*.java')
java  -cp lib/antlr4-runtime-4.13.2.jar:src:gen myLang.Main programs/demo.myl
```

---

## 📝 Licenza

Codice distribuito a solo scopo didattico. © 2025 Simone Mattioli
