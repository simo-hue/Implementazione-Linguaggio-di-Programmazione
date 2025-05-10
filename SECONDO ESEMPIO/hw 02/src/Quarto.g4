// Il nome della grammatica deve corrispondere al nome del file .g4
grammar Quarto;

// La regola iniziale del parser: tutta l'analisi parte da qui
main : a EOF ;  // 'a' deve consumare tutta la stringa, fino alla fine (EOF)

// Regola 'a':
// - può essere: 'a' seguito da a seguito da 'c' → struttura annidata a-c
// - oppure può essere un 'b' (cioè invocare la regola b)
// - oppure può essere vuota (ε)
a : A a C
  | b
  | ;

// Regola 'b':
// - può essere: 'b' seguito da b seguito da 'c' → struttura annidata b-c
// - oppure vuota (ε)
b : B b C
  | ;

// Token terminali: lettere singole
A : 'a' ;  // corrisponde al carattere 'a'
B : 'b' ;  // corrisponde al carattere 'b'
C : 'c' ;  // corrisponde al carattere 'c'
