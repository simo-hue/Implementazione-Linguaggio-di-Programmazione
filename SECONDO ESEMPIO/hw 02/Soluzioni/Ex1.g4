// Nome della grammatica: deve corrispondere al nome del file .g4
grammar Ex1;

// Punto di ingresso del parser: la regola 'main' deve matchare tutta la stringa (EOF = fine input)
main : s EOF;

// Regola principale 's':
// accetta una sequenza composta da 5 blocchi 'x' separati da 4 simboli '1'
s : x O x O x O x O x;

// Un blocco 'x' è una sequenza (anche vuota) di simboli '0' e '1'
// È definita ricorsivamente:
// - Z x → un '0' seguito da un altro 'x'
// - O x → un '1' seguito da un altro 'x'
// - ε (vuoto) → consente che 'x' sia anche una stringa vuota
x : Z x
  | O x
  | ;

// Token terminale 'Z': rappresenta il simbolo '0'
Z : '0';

// Token terminale 'O': rappresenta il simbolo '1'
O : '1';
