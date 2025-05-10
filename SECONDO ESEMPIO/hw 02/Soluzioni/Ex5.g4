grammar Ex4;

main : s EOF;
s    : s1 | s2;
s1   : Z s1 O | ;
s2   : Z s2 O O | ;

Z    : '0';
O    : '1';