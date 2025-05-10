grammar Quinto; // Il nome della grammatica deve essere uguale al nome del file .g4

// Punto di ingresso del parser: 's' deve consumare tutta la stringa
main : s EOF ;

// La regola 's' può essere una 's1' oppure una 's2'
s : s1 | s2 ;

// Regola 's1':
// - genera stringhe della forma: 0^n 1^n (tanti 0 seguiti da altrettanti 1)
// - caso base: stringa vuota
s1 : Z s1 O
   | ;

// Regola 's2':
// - genera stringhe della forma: 0^n 1^(2n) (tanti 0 seguiti dal doppio di 1)
// - caso base: stringa vuota
s2 : Z s2 O O
   | ;

// Token terminali
Z : '0' ;
O : '1' ;
