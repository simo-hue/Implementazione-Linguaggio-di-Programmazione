grammar Test;

// REGOLE ( non terminali minuscoli )
main: s EOF;
s: x ZERO x ZERO x ZERO x ZERO x ;
x: ONE x | ZERO x | ;


// ESPLICITO I TOKEN DEL LINGUAGGIO
ZERO : '0';
ONE : '1';