// Ricordarsi che deve essere sempre uguale al nome del file
grammar Palidrome;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : pal EOF ;

pal: | '0' pal '0'
    | '1' pal '1'
    | '2' pal '2'
    | '3' pal '3'
    | '4' pal '4'
    | '5' pal '5'
    | '6' pal '6'
    | '7' pal '7'
    | '8' pal '8'
    | '9' pal '9'
    | ;