// Ricordarsi che deve essere sempre uguale al nome del file
grammar Terzo;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : base EOF ;

base: Z base Z | O base O | Z | O | ;

Z: '0' ;
O: '1' ;