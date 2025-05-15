parser grammar GrammaticaParser;
options { tokenVocab=GrammaticaLexer; }

// ---- Parser rules ----
program
    : statement* EOF
    ;

statement
    : slyStmt
    | otherStmt
    ;

otherStmt
    : varDecl
    | assignStmt
    | printStmt
    | exprStmt
    | whileStmt
    | ifStmt
    | forStmt
    | nonDetStmt
    | funDecl
    | retStmt
    ;

varDecl
    : VAR ID (LBRACK expr RBRACK)? ASSIGN expr SEMICOLON?
    ;

assignStmt
    : ID ASSIGN expr SEMICOLON?
    | ID LBRACK expr RBRACK ASSIGN expr SEMICOLON?
    ;

printStmt
    : PRINT LPAREN expr RPAREN SEMICOLON?
    ;

exprStmt
    : expr SEMICOLON?
    ;

whileStmt
    : WHILE LPAREN expr RPAREN block
    ;

ifStmt
    : IF LPAREN expr RPAREN block (ELSE block)?
    ;

forStmt
    : FOR LPAREN forInit? SEMICOLON expr? SEMICOLON forUpdate? RPAREN block
    ;

forInit
    : VAR ID ASSIGN expr
    | ID ASSIGN expr
    ;

forUpdate
    : ID ASSIGN expr
    ;

block
    : LBRACE statement* RBRACE
    ;

nonDetStmt
    : block ND LBRACK statement RBRACK SEMICOLON?
    ;

funDecl
    : FUN ID LPAREN RPAREN block
    ;

retStmt
    : RET expr SEMICOLON?
    ;

slyStmt
    : SLY_START bfProgram BF_RBRACE ARNOLD SEMICOLON?
    ;

bfProgram
    : bfCommand*
    ;

bfCommand
    : BF_LT      # BfLt
    | BF_GT      # BfGt
    | BF_PLUS    # BfPlus
    | BF_MINUS   # BfMinus
    | BF_DOT     # BfDot
    | BF_COMMA   # BfComma
    | BF_LBRAK bfProgram BF_RBRAK  # BfLoop
    ;

// ---- Expressions ----
expr
    : ID LPAREN RPAREN               # callExpr
    | expr CONCAT expr               # concatExpr
    | expr POW expr                  # powExpr
    | expr MUL expr                  # mulExpr
    | expr DIV expr                  # divExpr
    | expr MOD expr                  # modExpr
    | expr PLUS expr                 # addExpr
    | expr MINUS expr                # subExpr
    | expr LT expr                   # ltExpr
    | expr GT expr                   # gtExpr
    | expr LE expr                   # leExpr
    | expr GE expr                   # geExpr
    | expr EQ expr                   # eqExpr
    | expr NE expr                   # neExpr
    | MINUS expr                     # unaryMinus
    | LPAREN expr RPAREN             # parensExpr
    | ID LBRACK expr RBRACK          # arrayAccess
    | INPUT LPAREN RPAREN            # inputExpr
    | STR_KW LPAREN expr RPAREN      # strExpr
    | ID                             # idExpr
    | FLOAT                          # floatExpr
    | INT                            # intExpr
    | STRING                         # stringExpr
    ;
