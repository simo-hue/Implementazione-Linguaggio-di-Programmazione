// Ricordarsi che deve essere sempre uguale al nome del file
grammar Naturali;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : nat EOF ;

//Devo ragionare sul cosa ritengo valido come NATURALE
// NON voglio accettare quelli che iniziano per zero
nat: '0' | '1' seq
      | '2' seq | '3' seq
      | '4' seq | '5' seq
      | '6' seq | '7' seq
      | '8' seq | '9' seq ;

seq:  | '0' seq | '1' seq
      | '2' seq | '3' seq
      | '4' seq | '5' seq
      | '6' seq | '7' seq
      | '8' seq | '9' seq ;