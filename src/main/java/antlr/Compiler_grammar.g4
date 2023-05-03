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

classbodydeclaration: fielddeclaration |
                    methoddeclaration;

fielddeclaration:   type variabledeclarators SEMICOLON|
                    accessmodifier type variabledeclarators SEMICOLON;

type:               primitivetype |
                    referencetype;

primitivetype:      BOOLEAN |
                    INT |
                    CHAR;

referencetype:      classorinterfacetype;

classorinterfacetype:   name;

name:               simplename;
                    //qualifiedname;

simplename:         IDENTIFIER;

//qualifiedname:      name DOT IDENTIFIER;

variabledeclarators:    variabledeclarator |
                    variabledeclarator COMMA variabledeclarators;

variabledeclarator: IDENTIFIER;
                    //IDENTIFIER ASSIGN variableinitializer;
//variableinitializer: expression;

methoddeclaration: methodheader methodbody;

methodheader:       type methoddeclarator |
                    accessmodifier type methoddeclarator |
                    VOID methoddeclarator |
                    accessmodifier VOID methoddeclarator;

methoddeclarator:   IDENTIFIER LBRACE RBRACE;
                    //IDENTIFIER LBRACE formalparameterlist RBRACE;

methodbody:         block |
                    SEMICOLON;

block:              LBRACKET RBRACKET |
                    LBRACKET blockstatements RBRACKET;

blockstatements:    blockstatement |
                    blockstatement blockstatements;

blockstatement:     localvariabledeclaration SEMICOLON|
                    statement;

localvariabledeclaration: type variabledeclarators;

statement:          ifstatement |
                    ifelsestatement |
                    whilestatement |
                    statementwithoutrailingsubstatement;

ifstatement:        IF LBRACE expression RBRACE statement;

ifelsestatement:    IF LBRACE expression RBRACE statementnoshortif  ELSE statement;

whilestatement:     WHILE LBRACE expression RBRACE statement;

statementwithoutrailingsubstatement:    block |
                    emptystatement |
                    expressionstatement |
                    returnstatement;

emptystatement:     SEMICOLON;

expressionstatement:    statementexpression SEMICOLON;

returnstatement:    RETURN SEMICOLON |
                    RETURN expression SEMICOLON;

statementnoshortif: statementwithoutrailingsubstatement |
                    ifelsestatementnoshortif |
                    whilestatementnoshortif;

ifelsestatementnoshortif:   IF LBRACE expression RBRACE statementnoshortif ELSE statementnoshortif;

whilestatementnoshortif:    WHILE LBRACE expression RBREACE statementnoshortif;

statementexpression:    assignment |
                    preincrementexpression |
                    predecrementexpression |
                    postincrementexpression |
                    postdecrementexpression |
                    methodcallexpression | //methodinvocation
                    newexpression; //classinstancecreationexpression

assignment:         lefthandside assignmentoperator assignmentexpression;

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

preincrementexpression: INCREMENT unaryexpression;

predecrementexpression: DECREMENT unaryexpression;

postincrementexpression: postfixexpression INCREMENT;

postdecrementexpression: postfixexpression DECREMENT;

methodcallexpression: name LBRACE RBRACE |
                    name LBRACE argumentlist RBRACE |
                    primary DOT IDENTIFIER LBRACE RBRACE |
                    primary DOT IDENTIFIER LBRACE argumentlist RBRACE;

argumentlist:       expression |
                    expression COMMA argumentlist;

primary:            literal |
                    THIS |
                    LBRACE expression RBRACE |
                    newexpression;
                    //fieldaccess |
                    //methodcallexpression;

fieldaccess:        primary DOT IDENTIFIER;

newexpression:      NEW classorinterfacetype LBRACE RBRACE |
                    NEW classorinterfacetype LBRACE argumentlist RBRACE;

literal:            INTLITERAL |
                    BOOLLITERAL |
                    CHARLITERAL |
                    STRINGLITERAL |
                    JNULL;

postfixexpression:  primary |
                    name;
                    //postincrementexpression |
                    //postdecrementexpression;

unaryexpression:    preincrementexpression |
                    predecrementexpression |
                    PLUS unaryexpression |
                    MINUS unaryexpression |
                    unaryexpressionnotplusminus;

unaryexpressionnotplusminus:    postfixexpression |
                    TILDE unaryexpression |
                    EXCLMARK unaryexpression |
                    castexpression;

castexpression:     LBRACE primitivetype RBRACE unaryexpression |
                    LBRACE expression RBRACE unaryexpressionnotplusminus;

assignmentexpression:   assignment;



expression:         IDENTIFIER;

