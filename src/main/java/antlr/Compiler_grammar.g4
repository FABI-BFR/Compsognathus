grammar Compiler_grammar;


WS : [ \t\n\r]+ -> skip;

//Chars/Signs
AND : '&';
ASSIGN : '=';
LBRACKET : '{';
RBRACKET : '}';
COLON : ':';
COMMA : ',';
DIV : '/';
DOT : '.';
EXCLMARK : '!';
GREATER : '>';
LBRACE : '(';
LESS : '<';
MINUS : '-';
MOD : '%';
MUL : '*';
OR : '|';
PLUS : '+';
RBRACE : ')';
SEMICOLON : ';';
TILDE : '~';
XOR : '^';

//Operators (Multiple Chars)
ANDEQUAL : '&=';
DIVIDEEQUAL : '/=';
EQUAL : '==';
GREATEREQUAL : '>=';
LESSEQUAL : '<=';
LOGICALOR : '||';
LOGICALAND: '&&';
MINUSEQUAL : '-=';
MODULOEQUAL : '%=';
NOTEQUAL : '!=';
OREQUAL : '|=';
PLUSEQUAL : '+=';
SHIFTLEFTEQUAL : '<<=';
SIGNEDSHIFTRIGHTEQUAL : '>>=';
TIMESEQUAL : '*=';
UNSIGNEDSHIFTRIGHTEQUAL : '>>>=';
XOREQUAL : '^=';
INC : '++';
DEC : '--';


//Keywords
BOOLEAN : 'boolean';
BOOLLITERAL : 'true'|'false';
CHAR : 'char';
CLASS : 'class';
ELSE : 'else';
IF : 'if';
INT : 'int';
JNULL : 'null';
NEW : 'new';
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
RETURN : 'return';
STATIC : 'static';
STRING : 'String';
THIS : 'this';
VOID : 'void';
WHILE : 'while';

CLASSIDENTIFIER : [A-Z]([a-zA-Z0-9]|'_')*;
IDENTIFIER : [a-zA-Z]([a-zA-Z0-9]|'_')*;
INTLITERAL : [0-9]+;
CHARLITERAL : '\''.'\'';
STRINGLITERAL : '"'.*?'"';


compilationunit :   classdeclarations;

classdeclarations : classdeclaration*;

classdeclaration :  accessmodifier CLASS CLASSIDENTIFIER classbody |
                    CLASS CLASSIDENTIFIER classbody;

accessmodifier :    PUBLIC |
                    PRIVATE |
                    PROTECTED;

classbody :         LBRACKET RBRACKET |
                    LBRACKET classbodydeclarations RBRACKET;

classbodydeclarations: classbodydeclaration*;

classbodydeclaration:   constructordeclaration|
                    fielddeclaration |
                    methoddeclaration;

constructordeclaration: constructordeclarator constructorbody |
                    accessmodifier constructordeclarator constructorbody;

constructordeclarator:  CLASSIDENTIFIER LBRACE RBRACE |
                    CLASSIDENTIFIER LBRACE formalparameterlist RBRACE;

constructorbody:    block |
                    SEMICOLON;

                    /*LBRACKET RBRACKET |
                    LBRACKET explicitconstructorinovacation RBRACKET |
                    LBRACKET blockstatements RBRACKET |
                    LBRACKET explicitconstructorinovacation blockstatements RBRACKET;*/

explicitconstructorinovacation: THIS LBRACE RBRACE SEMICOLON |
                    THIS LBRACE argumentlist RBRACE SEMICOLON;

argumentlist:       expression |
                    expression COMMA argumentlist;

fielddeclaration:   type variabledeclarators SEMICOLON|
                    accessmodifier type variabledeclarators SEMICOLON;

type:               primitivetype |
                    abstracttype;

primitivetype:      BOOLEAN |
                    INT |
                    CHAR;

abstracttype:       STRING |
                    name;

name:               simplename |
                    qualifiedname;

simplename:         IDENTIFIER;

qualifiedname:      IDENTIFIER DOT name;

variabledeclarators:    variabledeclarator |
                    variabledeclarator COMMA variabledeclarators;

variabledeclarator: IDENTIFIER |
                    name ASSIGN assignmentexpression;
                    /*statementexpression;
                    /*IDENTIFIER ASSIGN expression |
                    IDENTIFIER ASSIGN methodcallexpression |
                    IDENTIFIER ASSIGN newexpression;//variableinitializer;*/

expression:         IDENTIFIER |
                    literal |
                    literal PLUS expression |
                    literal MINUS expression |
                    literal MUL expression |
                    literal DIV expression |
                    literal MOD expression |
                    IDENTIFIER PLUS expression |
                    IDENTIFIER MINUS expression |
                    IDENTIFIER MUL expression |
                    IDENTIFIER DIV expression |
                    IDENTIFIER MOD expression;

methoddeclaration: methodheader methodbody;

methodheader:       type methoddeclarator |
                    accessmodifier type methoddeclarator |
                    VOID methoddeclarator |
                    accessmodifier VOID methoddeclarator;

methoddeclarator:   IDENTIFIER LBRACE RBRACE |
                    IDENTIFIER LBRACE formalparameterlist RBRACE;

formalparameterlist:  formalparameter |
                    formalparameter COMMA formalparameterlist;

formalparameter:    type IDENTIFIER;

methodbody:         block |
                    SEMICOLON;

block:              LBRACKET RBRACKET |
                    LBRACKET blockstatements RBRACKET;

blockstatements:    blockstatement*;

blockstatement:     localvariabledeclaration SEMICOLON|
                    statement;

localvariabledeclaration: type variabledeclarators;

statement:          ifstatement |
                    ifelsestatement |
                    whilestatement |
                    statementwithoutrailingsubstatement;

ifstatement:        IF LBRACE compareexpression RBRACE statement;

ifelsestatement:    IF LBRACE compareexpression RBRACE statementnoshortif  ELSE statement;

whilestatement:     WHILE LBRACE compareexpression RBRACE statement;

compareexpression:  name |
                    BOOLLITERAL |
                    IDENTIFIER |
                    methodcallexpression |
                    expression1 compareoperator expression2 |
                    name logicaloperator compareexpression |
                    BOOLLITERAL logicaloperator compareexpression |
                    IDENTIFIER logicaloperator compareexpression |
                    methodcallexpression logicaloperator compareexpression |
                    expression1 compareoperator expression2 logicaloperator compareexpression;

expression1:        expression;
expression2:        expression;

compareoperator:    GREATER |
                    LESS |
                    ANDEQUAL|
                    DIVIDEEQUAL |
                    EQUAL |
                    GREATEREQUAL |
                    LESSEQUAL |
                    MINUSEQUAL |
                    MODULOEQUAL |
                    NOTEQUAL |
                    OREQUAL |
                    PLUSEQUAL |
                    SHIFTLEFTEQUAL |
                    SIGNEDSHIFTRIGHTEQUAL |
                    TIMESEQUAL |
                    UNSIGNEDSHIFTRIGHTEQUAL |
                    XOREQUAL;

logicaloperator:    LOGICALOR |
                    LOGICALAND;

statementwithoutrailingsubstatement:    block |
                    emptystatement |
                    expressionstatement |
                    returnstatement;

emptystatement:     SEMICOLON;

expressionstatement:    statementexpression SEMICOLON;

returnstatement:    RETURN SEMICOLON |
                    RETURN statementexpression SEMICOLON;

statementnoshortif1:    statementnoshortif;
statementnoshortif2:    statementnoshortif;

statementnoshortif: statementwithoutrailingsubstatement |
                    ifelsestatementnoshortif |
                    whilestatementnoshortif;

ifelsestatementnoshortif:   IF LBRACE compareexpression RBRACE statementnoshortif1 ELSE statementnoshortif2;

whilestatementnoshortif:    WHILE LBRACE compareexpression RBRACE statementnoshortif;

statementexpression:    expression |
                    assignment |
                    preincrementexpression |
                    predecrementexpression |
                    postincrementexpression |
                    postdecrementexpression |
                    methodcallexpression | //methodinvocation
                    newexpression; //classinstancecreationexpression

assignment:         name ASSIGN assignmentexpression |
                    THIS DOT name ASSIGN assignmentexpression;


assignmentexpression:   expression |
                    preincrementexpression |
                    predecrementexpression |
                    postincrementexpression |
                    postdecrementexpression |
                    methodcallexpression | //methodinvocation
                    newexpression;

/*
lefthandside:       name;
assignmentoperator: ASSIGN |
                    TIMESEQUAL |
                    DIVIDEEQUAL |
                    MODULOEQUAL |
                    PLUSEQUAL |
                    MINUSEQUAL |
                    SHIFTLEFTEQUAL |
                    SIGNEDSHIFTRIGHTEQUAL |
                    UNSIGNEDSHIFTRIGHTEQUAL |
                    ANDEQUAL |
                    XOREQUAL |
                    OREQUAL;
*/

preincrementexpression: INC name;

predecrementexpression: DEC name;

postincrementexpression: name INC;

postdecrementexpression: name DEC;

methodcallexpression: name LBRACE RBRACE |
                    name LBRACE argumentlist RBRACE |
                    name DOT IDENTIFIER LBRACE RBRACE |
                    name DOT IDENTIFIER LBRACE argumentlist RBRACE |
                    THIS DOT IDENTIFIER LBRACE RBRACE |
                    THIS DOT IDENTIFIER LBRACE argumentlist RBRACE |
                    /*LBRACE expression RBRACE DOT IDENTIFIER LBRACE RBRACE |
                    LBRACE expression RBRACE DOT IDENTIFIER LBRACE argumentlist RBRACE |*/
                    newexpression DOT IDENTIFIER LBRACE RBRACE |
                    newexpression DOT IDENTIFIER LBRACE argumentlist RBRACE;
                    /*fieldaccess DOT IDENTIFIER LBRACE RBRACE |
                    fieldaccess DOT IDENTIFIER LBRACE argumentlist RBRACE |
                    methodcallexpression DOT IDENTIFIER LBRACE RBRACE |
                    methodcallexpression DOT IDENTIFIER LBRACE argumentlist RBRACE;*/
/*
primary:            name |
                    literal |
                    THIS |
                    LBRACE expression RBRACE |
                    newexpression |
                    fieldaccess |
                    methodcallexpression;

fieldaccess:        primary DOT IDENTIFIER;*/

newexpression:      NEW name LBRACE RBRACE |
                    NEW name LBRACE argumentlist RBRACE;

literal:            INTLITERAL |
                    BOOLLITERAL |
                    CHARLITERAL |
                    STRINGLITERAL |
                    JNULL;


/*
assignmentexpression:   assignment ;
                    //conditionalexpression;


conditionalexpression: conditionalorexpression |
                    conditionalorexpression QUESMARK expression COLON conditionalexpression;

conditionalorexpression:    conditionalandexpression |
                    conditionalorexpression LOGICALOR conditionalandexpression;

conditionalandexpression:   inclusiveorexpression;

inclusiveorexpression:  exclusiveorexpression |
                    exclusiveorexpression OR inclusiveorexpression;

exclusiveorexpression: andexpression |
                    andexpression XOR exclusiveorexpression;

andexpression:      equalityexpression |
                    equalityexpression AND andexpression;

equalityexpression: relationalexpression |
                    relationalexpression EQUAL equalityexpression |
                    relationalexpression NOTEQUAL equalityexpression;

relationalexpression:   shiftexpression;

shiftexpression:    additiveexpression;

additiveexpression: multiplicationexpression |
                    multiplicationexpression PLUS additiveexpression |
                    multiplicationexpression MINUS additiveexpression;

multiplicationexpression:   unaryexpression MUL multiplicationexpression |
                    unaryexpression DIV multiplicationexpression |
                    unaryexpression MOD multiplicationexpression;
                    */