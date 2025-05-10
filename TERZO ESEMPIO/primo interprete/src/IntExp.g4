grammar IntExp;

main : exp EOF ;

exp  : NAT                       # nat
     | LPAR exp MUL exp RPAR     # mul
     | LPAR exp PLUS exp RPAR    # plus
     ;

LPAR : '(' ;
RPAR : ')' ;
PLUS : '+' ;
MUL  : '*' ;

NAT  : '0' | [1-9][0-9]* ;

WS   : [ \t\n\r]+ -> skip ;

