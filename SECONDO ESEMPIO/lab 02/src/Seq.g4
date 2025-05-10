// Ricordarsi che deve essere sempre uguale al nome del file
grammar Seq;

// NON Terminali devo iniziare con una lettera minuscola
// Terminali tra APICI Singoli

// FIne del file
main : seq EOF ;

//seq: | Mi va ad accettare una sequenza VUOTA per via di: " |"
seq: | '0' seq | '1' seq
      | '2' seq | '3' seq
      | '4' seq | '5' seq
      | '6' seq | '7' seq
      | '8' seq | '9' seq ;