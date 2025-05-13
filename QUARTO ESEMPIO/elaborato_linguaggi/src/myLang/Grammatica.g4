// File: MyLang.g4

grammar Grammatica;

// ENTRY POINT
program : statement* EOF ; // Un programma è una lista di statement

// POSSIBILI STATEMENT
statement
    : varDecl         // Dichiarazione variabile
    | printStmt       // Print
    | exprStmt        // Solo valutazione espressione
    ;

// Dichiarazione variabile: var x = <expr>;
varDecl : 'var' ID '=' expr ';' ;

// Print: print(<expr>);
printStmt : 'print' '(' expr ')' ';' ;

// Espressione seguita da punto e virgola
exprStmt : expr ';' ;

// ESPRESSIONI
expr
    : expr '^' expr     # powExpr
    | expr '*' expr     # mulExpr
    | expr '/' expr     # divExpr
    | expr '%' expr     # modExpr
    | expr '+' expr     # addExpr
    | expr '-' expr     # subExpr
    | '-' expr          # unaryMinus
    | '(' expr ')'      # parensExpr
    | 'input' '(' ')'   # inputExpr
    | 'str' '(' expr ')' # strExpr
    | ID                # idExpr
    | FLOAT             # floatExpr
    | INT               # intExpr
    | STRING            # stringExpr
    ;

// LITERAL TOKEN RULES
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
INT     : [0-9]+ ;
STRING  : '"' ( ~["\\] | '\\' . )* '"' ;

// IGNORA SPAZI E COMMENTI
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
