// Ricordarsi che deve essere sempre uguale al nome del file
grammar Secondo;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : base EOF ;

base: '0' elem '0' |
      '1' elem '1' |
      '0' base '0' |
      '1' base '1' |
      elem;

elem: '0' |
      '1' ;