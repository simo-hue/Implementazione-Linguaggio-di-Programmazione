// Definizione della grammatica per semplici espressioni intere parentesizzate
grammar IntExp;

// Punto di ingresso del parser: accetta un'espressione seguita dalla fine del file/input
main : exp EOF ;

// Regola per le espressioni (exp):
// - Un numero naturale singolo: es. 5           → NAT
// - Un'espressione moltiplicativa: es. (3 * 4)  → mul
// - Un'espressione additiva: es. (2 + 7)        → plus
exp  : NAT                       # nat          // caso base: numero naturale
     | LPAR exp MUL exp RPAR     # mul          // moltiplicazione completamente parentesizzata
     | LPAR exp PLUS exp RPAR    # plus         // somma completamente parentesizzata
     ;

// Token lessicali: simboli di punteggiatura e operatori
LPAR : '(' ;        // parentesi aperta
RPAR : ')' ;        // parentesi chiusa
PLUS : '+' ;        // operatore di somma
MUL  : '*' ;        // operatore di moltiplicazione

// Token per i numeri naturali: 0 oppure sequenze non zeppe di zeri
// Es. 0, 1, 12, 305 sono validi — 012 no
NAT  : '0' | [1-9][0-9]* ;

// Token per spazi, tabulazioni, ritorni a capo: vengono ignorati dal lexer
WS   : [ \t\n\r]+ -> skip ;