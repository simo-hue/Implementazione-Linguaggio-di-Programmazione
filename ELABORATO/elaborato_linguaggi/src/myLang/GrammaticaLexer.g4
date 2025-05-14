lexer grammar GrammaticaLexer;

// ---- Default mode tokens ----
SLY_START : 'sly' '{' -> pushMode(BF);
ARNOLD    : 'arnold';
PRINT     : 'print';
WHILE     : 'while';
IF        : 'if';
ELSE      : 'else';
FOR       : 'for';
VAR       : 'var';
ND        : 'ND';
FUN       : 'fun';
RET       : 'ret';
INPUT     : 'input';
STR_KW    : 'str';

SEMICOLON : ';';
COMMA     : ',';
DOT       : '.';
LPAREN    : '(';
RPAREN    : ')';
LBRACK    : '[';
RBRACK    : ']';
LBRACE    : '{';
RBRACE    : '}';

GE        : '>=';
LE        : '<=';
EQ        : '==';
NE        : '!=';
AND       : '&&';
OR        : '||';
NOT       : '!';
POW       : '^';
MUL       : '*';
DIV       : '/';
MOD       : '%';
ASSIGN    : '=';
LT        : '<';
GT        : '>';
CONCAT    : '++';
PLUS      : '+';
MINUS     : '-';

ID        : [a-zA-Z_][a-zA-Z0-9_]*;
FLOAT     : [0-9]+ '.' [0-9]+;
INT       : [0-9]+;
STRING
  : '"' (~["\\\r\n] | '\\' . )* '"'
  | '“' (~[“\\\r\n] | '\\' . )* '”'
  ;

WS        : [ \t\r\n]+ -> skip;
COMMENT   : '//' ~[\r\n]* -> skip;

// ---- Brainfuck mode ----
mode BF;
BF_WS     : [ \t\r\n]+ -> skip;
BF_LT     : '<';
BF_GT     : '>';
BF_PLUS   : '+';
BF_MINUS  : '-';
BF_DOT    : '.';
BF_COMMA  : ',';
BF_LBRAK  : '[';
BF_RBRAK  : ']';
BF_RBRACE : '}' -> popMode;
BF_OTHER  : . -> skip;