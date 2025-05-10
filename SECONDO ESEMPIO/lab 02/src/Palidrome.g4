// Ricordarsi che deve essere sempre uguale al nome del file
grammar Palidrome;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : pal EOF ;

pal: | '0' pal '0'
    | '1' pal '1' ;