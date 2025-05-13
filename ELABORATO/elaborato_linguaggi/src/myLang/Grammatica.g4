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
    | ifStmt            // if (expr) { ... } else { ... }
    | forStmt           // for (init; cond; update) { ... }
    | nonDetStmt       // non determinismo
    ;

// Istruzione condizionale if-else
ifStmt: 'if' '(' expr ')' block        // blocco "then"
      ( 'else' block )?             // opzionale blocco "else"
    ;

// dichiarazione variabile
varDecl
    : 'var' ID '=' expr ';'
    ;

// Assegnazione “normale”: x = expr; + array[index]
assignStmt
    : ID '=' expr ';'
    | ID '[' expr ']'  '=' expr ';'
    ;

// print
printStmt
    : 'print' '(' expr ')' ';'
    ;
// espressione standalone
exprStmt
    : expr ';'
    ;

// while
whileStmt
    : 'while' '(' expr ')' block
    ;

// Ciclo for: for ( init ; cond ; update ) block
forStmt
    : 'for'
      '('
         forInit?     // inizializzazione: var x=... oppure x=...
         ';'
         expr?        // condizione: un'espressione booleana
         ';'
         forUpdate?   // update: assegnazione  x=expr
      ')'
      block
    ;

// forInit: var x = expr   oppure   x = expr
forInit
    : 'var' ID '=' expr
    | ID '=' expr
    ;

// forUpdate: solo l’assegnazione  x = expr  (senza ';')
forUpdate
    : ID '=' expr
    ;

// blocco di zero o più statement
block
    : '{' statement* '}'
    ;
// --------------------------------------------------

// ESPRESSIONI
expr
    : expr '++' expr      # concatExpr
    | expr '^' expr       # powExpr
    | expr '*' expr       # mulExpr
    | expr '/' expr       # divExpr
    | expr '%' expr       # modExpr
    | expr '+' expr       # addExpr
    | expr '-' expr       # subExpr
    | expr '<' expr     # ltExpr
    | expr '>' expr     # gtExpr
    | expr '<=' expr    # leExpr
    | expr '>=' expr    # geExpr
    | expr '==' expr    # eqExpr
    | expr '!=' expr    # neExpr
    | '-' expr            # unaryMinus
    | '(' expr ')'        # parensExpr
    | ID '[' expr ']'     # arrayAccess   // lettura x[expr]
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
GE      : '>=' ;
LE      : '<=' ;
EQ      : '==' ;
NE      : '!=' ;
GT      : '>' ;
LT      : '<' ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
INT     : [0-9]+ ;
STRING  : '"' ( ~["\\] | '\\' . )* '"' ;
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
