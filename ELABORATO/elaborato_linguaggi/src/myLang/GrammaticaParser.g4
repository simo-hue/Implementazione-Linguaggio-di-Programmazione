parser grammar GrammaticaParser;
options { tokenVocab=GrammaticaLexer; }

/*────────────────────────  PARSER  ────────────────────────*/
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

/*────────────  simple  ────────────*/
varDecl        : VAR ID (LBRACK expr RBRACK)? ASSIGN expr SEMICOLON? ;

assignStmt     : ID ASSIGN expr SEMICOLON?
               | ID LBRACK expr RBRACK ASSIGN expr SEMICOLON? ;

printStmt      : PRINT LPAREN expr RPAREN SEMICOLON? ;

exprStmt       : expr SEMICOLON? ;

/*────────────  control  ────────────*/
whileStmt      : WHILE LPAREN expr RPAREN block ;

ifStmt         : IF LPAREN expr RPAREN block (ELSE block)? ;

forStmt        : FOR LPAREN forInit? SEMICOLON expr? SEMICOLON forUpdate? RPAREN block ;

forInit        : VAR ID ASSIGN expr | ID ASSIGN expr ;

forUpdate      : ID ASSIGN expr ;

block          : LBRACE statement* RBRACE ;

nonDetStmt     : block ND LBRACK statement RBRACK SEMICOLON? ;

/*────────────  functions  ────────────*/
funDecl        : FUN ID LPAREN RPAREN block ;

retStmt        : RET expr SEMICOLON? ;

/*────────────  sly { brainfuck }  ────────────*/
slyStmt        : SLY_START bfProgram BF_RBRACE ARNOLD SEMICOLON? ;

bfProgram      : bfCommand* ;

bfCommand
    : BF_LT    # BfLt   | BF_GT  # BfGt   | BF_PLUS # BfPlus
    | BF_MINUS # BfMinus| BF_DOT # BfDot  | BF_COMMA # BfComma
    | BF_LBRAK bfProgram BF_RBRAK # BfLoop
    ;

/*────────────────────────  EXPRESSIONS  ────────────────────────*/
/*  expr = aritmetica  |  testuale (concatenazione)             */
expr
    : arithExpr        # exprArith
    | strExpr          # exprStr
    ;

/*────────────  STRINGS  ────────────*/
strExpr
    : exprStrPart (CONCAT exprStrPart)*      # concatExpr
    ;

exprStrPart
    : STR_KW LPAREN arithExpr RPAREN         # toStrInStrExpr // Conversione
    | STRING                                 # stringInStrExpr // Stringa
    | ID                                     # idInStrExpr // Variabile
    | INPUT LPAREN RPAREN                    # inputInStrExpr // Da Input
    | LPAREN strExpr RPAREN                  # parensStrExpr // espressione tra parentesi
    ;


/*────────────  ARITHMETIC  ────────────*/
arithExpr : compExpr ;

/*  comparazioni  (<,>,==,…)  */
compExpr
    : addExpr LT addExpr  # ltExpr
    | addExpr GT addExpr  # gtExpr
    | addExpr LE addExpr  # leExpr
    | addExpr GE addExpr  # geExpr
    | addExpr EQ addExpr  # eqExpr
    | addExpr NE addExpr  # neExpr
    | addExpr             # toAdd
    ;

/*  +  –  */
addExpr
    : multExpr ((PLUS | MINUS) multExpr)* # addExprOp
    ;

/*  *  /  %  */
multExpr
    : powExpr ((MUL | DIV | MOD) powExpr)* # mulExprOp
    ;

powExpr
    : unaryExpr (POW powExpr)?            # powExprOp
    ;

/*  − unario  */
unaryExpr
    : MINUS unaryExpr  # unaryMinus
    | atomExpr         # toAtom
    ;

/*────────────  ATOMS  ────────────*/
atomExpr
    : ID LPAREN RPAREN                   # callExpr
    | ID LBRACK expr RBRACK              # arrayAccess
    | ID                                 # idExpr
    | FLOAT                              # floatExpr
    | INT                                # intExpr
    | INPUT LPAREN RPAREN                 # inputExpr
    | LPAREN expr RPAREN                 # parensExpr
    ;
