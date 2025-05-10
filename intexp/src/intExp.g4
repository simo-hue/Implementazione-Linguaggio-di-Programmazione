grammar intExp;

main: exp EOF;

exp: NAT                        # nat
    | LPAR exp PLUS exp RPAR    # plus
    | LPAR exp MULT exp RPAR   # mult
    ;

LPAR: '(';
RPAR: ')';
PLUS: '+';
MULT: '*';

NAT: '0' | [1-9] [0-9]*;

WS: [ \t\n\r]+ -> skip;