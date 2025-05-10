grammar Ex3;

main : a EOF;
a    : A a C | b | ;
b    : B b C | ;

A    : 'a';
B    : 'b';
C    : 'c';
