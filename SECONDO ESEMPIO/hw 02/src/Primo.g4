// Ricordarsi che deve essere sempre uguale al nome del file
grammar Primo;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : base EOF ;

//Devo ragionare sul cosa ritengo valido come NATURALE
// NON voglio accettare quelli che iniziano per zero
base: '1111' | '1' elem '111' | '11' elem '11' | '111' elem '1' | '1111' elem | elem '1111';

// Cosa ci può essere INNESTATO
elem: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;