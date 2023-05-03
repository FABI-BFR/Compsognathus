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

classdeclarations : classdeclaration |
                    classdeclaration*;

classdeclaration :  accessmodifier CLASS CLASSIDENTIFIER classbody |
                    CLASS CLASSIDENTIFIER classbody;

accessmodifier :    PUBLIC |
                    PRIVATE |
                    PROTECTED;

classbody :         LBRACKET RBRACKET;
