grammar Compiler_Grammar;

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

classdeclarations : classdeclaration |
                    classdeclarations classdeclaration;

classdeclaration :  accessmodifier CLASS CLASSIDENTIFIER classbody |
                    CLASS CLASSIDENTIFIER classbody;

accessmodifier :    PUBLIC |
                    PRIVATE |
                    PROTECTED;

classbody :         LBRACKET RBRACKET|
                    LBRACKET classbodydeclarations RBRACKET;

modifiers :         accessmodifier |
                    accessmodifier STATIC;

classbodydeclarations : classbodydeclaration |
                        classbodydeclarations classbodydeclaration;

classbodydeclaration :  fielddeclaration |
                        methoddeclaration |
                        constructordeclaration;

fielddeclaration:   type variabledeclarators SEMICOLON |
                    modifiers type variabledeclarators SEMICOLON;

type :              primitivetype |
                    referencetype;

primitivetype :     INT |
                    CHAR |
                    BOOLEAN;

referencetype :     name |
                    STRING;

name :              qualifiedname |
                    simplename;

qualifiedname :     CLASSIDENTIFIER DOT name |
                    IDENTIFIER DOT name |
                    IDENTIFIER;

simplename :        CLASSIDENTIFIER |
                    IDENTIFIER;

variabledeclarators :   variabledeclarator |
                        variabledeclarators COMMA variabledeclarator;

variabledeclarator :    variabledeclaratorid |
                        variabledeclaratorid ASSIGN variableinitializer;

variabledeclaratorid :  IDENTIFIER;

variableinitializer :   expression |
                        literal;

expression :            assignmentexpression;

assignmentexpression :  conditionalorexpression |
                        assignment |
                        classinstancecreationexpression;

assignment :            lefthandside assignmentoperator assignmentexpression;

lefthandside :          name;

assignmentoperator :    ASSIGN |
                        PLUSEQUAL |
                        MINUSEQUAL |
                        MODULOEQUAL |
                        DIVIDEEQUAL |
                        TIMESEQUAL |
                        OREQUAL |
                        ANDEQUAL |
                        XOREQUAL |
                        SHIFTLEFTEQUAL |
                        SIGNEDSHIFTRIGHTEQUAL |
                        UNSIGNEDSHIFTRIGHTEQUAL;

conditionalorexpression :   conditionalandexpression |
                            conditionalorexpression LOGICALOR conditionalandexpression;

conditionalandexpression :  inclusiveorexpression;

constructordeclaration :    constructordeclarator constructorbody |
                            modifiers constructordeclarator constructorbody;

methoddeclaration :         methodheader methodbody;

methodheader :              type methoddeclarator |
                            modifiers type methoddeclarator |
                            VOID methoddeclarator |
                            modifiers VOID methoddeclarator;

methodbody :                block |
                            SEMICOLON;

methoddeclarator :          IDENTIFIER LBRACE RBRACE |
                            IDENTIFIER LBRACE formalparameterlist RBRACE;

formalparameterlist :       formalparameter |
                            formalparameterlist COMMA formalparameter;

formalparameter :           type variabledeclaratorid;

constructordeclarator :     CLASSIDENTIFIER LBRACE RBRACE |
                            CLASSIDENTIFIER LBRACE formalparameterlist RBRACE;

constructorbody :           block;

argumentlist :              expression |
                            argumentlist COMMA expression;

inclusiveorexpression :     exclusiveorexpression |
                            inclusiveorexpression OR exclusiveorexpression;

exclusiveorexpression :     andexpression |
                            exclusiveorexpression XOR andexpression;

andexpression :             equalityexpression |
                            andexpression AND equalityexpression;

equalityexpression :        relationalexpression |
                            equalityexpression EQUAL relationalexpression |
                            equalityexpression NOTEQUAL relationalexpression;

relationalexpression :      shiftexpression |
                            relationalexpression relationaloperator shiftexpression;

relationaloperator :        LESS |
                            GREATER |
                            LESSEQUAL |
                            GREATEREQUAL;

shiftexpression :           additiveexpression;

additiveexpression :        multiplicativeexpression |
                            additiveexpression PLUS multiplicativeexpression |
                            additiveexpression MINUS multiplicativeexpression;

multiplicativeexpression :  unaryexpression |
                            multiplicativeexpression MUL unaryexpression |
                            multiplicativeexpression DIV unaryexpression |
                            multiplicativeexpression MOD unaryexpression;

unaryexpression :           PLUS unaryexpression |
                            MINUS unaryexpression |
                            unaryexpressionnotplusminus;

unaryexpressionnotplusminus :   TILDE unaryexpression |
                                EXCLMARK unaryexpression |
                                castexpression |
                                methodinvocation |
                                primary |
                                name;

primary :                   THIS |
                            literal |
                            name |
                            LBRACE expression RBRACE |
                            classinstancecreationexpression;

castexpression :            LBRACE primitivetype RBRACE unaryexpression |
                            LBRACE expression RBRACE unaryexpressionnotplusminus;

block :                     LBRACKET RBRACKET |
                            LBRACKET blockstatements RBRACKET;

blockstatements :           statement |
                            blockstatements statement;

localvariabledeclarationstatement : type variabledeclarators SEMICOLON;

statement :                 localvariabledeclarationstatement |
                            statementwithouttrailingsubstatement |
                            ifthenstatement |
                            ifthenelsestatement |
                            whilestatement;

statementwithouttrailingsubstatement :  block |
                                        SEMICOLON |
                                        expressionstatement |
                                        returnstatement;

expressionstatement :       statementexpression SEMICOLON;

statementexpression :       assignment |
                            methodinvocation |
                            classinstancecreationexpression;

methodinvocation :          IDENTIFIER LBRACE RBRACE |
                            IDENTIFIER LBRACE argumentlist RBRACE |
                            primary DOT IDENTIFIER LBRACE RBRACE |
                            primary DOT IDENTIFIER LBRACE argumentlist RBRACE;

classinstancecreationexpression :   NEW classtype LBRACE RBRACE |
                                    NEW classtype LBRACE argumentlist RBRACE;

classtype :                 name;

returnstatement :           RETURN SEMICOLON |
                            RETURN expression SEMICOLON;

literal :                   INTLITERAL |
                            BOOLLITERAL |
                            CHARLITERAL |
                            STRINGLITERAL |
                            JNULL;

ifthenstatement :           IF LBRACE expression RBRACE statement;

ifthenelsestatement :       IF LBRACE expression RBRACE statementnoshortif ELSE statement;

whilestatement :            WHILE LBRACE expression RBRACE statement;

statementnoshortif :        statementwithouttrailingsubstatement |
                            ifthenelsestatementnoshortif |
                            whilestatementnoshortif;

ifthenelsestatementnoshortif :  IF LBRACE expression RBRACE statementnoshortif ELSE statementnoshortif;

whilestatementnoshortif :   WHILE LBRACE expression RBRACE statementnoshortif;
