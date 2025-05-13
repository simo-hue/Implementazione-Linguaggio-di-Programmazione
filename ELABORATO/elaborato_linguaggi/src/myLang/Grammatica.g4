// File: Grammatica.g4
grammar Grammatica;

// ENTRY POINT
program
    : statement* EOF
    ;

// STATEMENT
statement
    : varDecl           // var x = expr;
    | assignStmt        // x = expr;
    | printStmt         // print(expr);
    | exprStmt          // expr;
    | whileStmt         // while (expr) { ... }
    ;

// dichiarazione variabile
varDecl
    : 'var' ID '=' expr ';'
    ;
// Assegnazione “normale”: x = expr;
assignStmt
    : ID '=' expr ';'
    ;
// print
printStmt
    : 'print' '(' expr ')' ';'
    ;
// espressione standalone
exprStmt
    : expr ';'
    ;

// ------------- NUOVE REGOLE PER WHILE -------------
whileStmt
    : 'while' '(' expr ')' block
    ;

// blocco di zero o più statement
block
    : '{' statement* '}'
    ;
// --------------------------------------------------

// ESPRESSIONI
expr
    : expr '^' expr       # powExpr
    | expr '*' expr       # mulExpr
    | expr '/' expr       # divExpr
    | expr '%' expr       # modExpr
    | expr '+' expr       # addExpr
    | expr '-' expr       # subExpr
    | '-' expr            # unaryMinus
    | '(' expr ')'        # parensExpr
    | 'input' '(' ')'     # inputExpr
    | 'str' '(' expr ')'  # strExpr
    | ID                  # idExpr
    | FLOAT               # floatExpr
    | INT                 # intExpr
    | STRING              # stringExpr
    ;

//////////////////////////////////////////////////////
// LEXER RULES
//////////////////////////////////////////////////////
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
INT     : [0-9]+ ;
STRING  : '"' ( ~["\\] | '\\' . )* '"' ;
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
