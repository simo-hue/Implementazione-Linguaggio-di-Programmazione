parser grammar GrammaticaParser;
options { tokenVocab=GrammaticaLexer; }

/*────────────────────────  PARSER RULES  ────────────────────────*/
program
    : statement* EOF
    ;

/*────────────  top-level statements  ────────────*/
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

/*────────────  simple statements  ────────────*/
varDecl        : VAR ID (LBRACK expr RBRACK)? ASSIGN expr SEMICOLON? ;
assignStmt     : ID ASSIGN expr SEMICOLON?
               | ID LBRACK expr RBRACK ASSIGN expr SEMICOLON? ;
printStmt      : PRINT LPAREN expr RPAREN SEMICOLON? ;
exprStmt       : expr SEMICOLON? ;

/*────────────  control flow  ────────────*/
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

/*────────────  STRING-side  ────────────*/
strExpr
    : exprStrPart (CONCAT exprStrPart)*   # concatExpr
    ;

exprStrPart
    : STR_KW LPAREN arithExpr RPAREN      # toStrInStrExpr
    | STRING                              # stringInStrExpr
    | ID                                  # idInStrExpr
    | INPUT LPAREN RPAREN                 # inputInStrExpr
    | LPAREN strExpr RPAREN               # parensStrExpr
    ;

/*────────────  ARITHMETIC-side  ────────────*/
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

/*  ^  (right-assoc)  */
powExpr
    : unaryExpr (POW powExpr)?            # powExprOp
    ;

/*  − unario  */
unaryExpr
    : MINUS unaryExpr  # unaryMinus
    | atomExpr         # toAtom
    ;

/*────────────  ATOMS  ────────────*/
/*  >>> NOTA: NIENTE STRING QUI <<< */
atomExpr
    : ID LPAREN RPAREN                   # callExpr
    | ID LBRACK expr RBRACK              # arrayAccess
    | INPUT LPAREN RPAREN                # inputExpr
    | STR_KW LPAREN arithExpr RPAREN     # toStrExpr
    | ID                                 # idExpr
    | FLOAT                              # floatExpr
    | INT                                # intExpr
    | LPAREN expr RPAREN                 # parensExpr
    ;
