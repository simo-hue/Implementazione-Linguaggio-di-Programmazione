// Ricordarsi che deve essere sempre uguale al nome del file
grammar RecList;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : list EOF ;

// Accetto una sequenza VUOTA per via di: " |"
list: '(' ')' | '(' elem coda ')' ;

// Tutte le cifre da 1 a 9
elem: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'  | list ;

coda: | ',' elem coda ;