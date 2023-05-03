package bytecode;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import semantikCheck.Access;
import semantikCheck.Class;
import semantikCheck.Program;
import semantikCheck.Type;

import java.util.ArrayList;
import java.util.List;


public class ByteCodeGenerator
{

    public List<ClassFile> generate (@NotNull Program _program)
    {

        List<ClassFile> classFiles = new ArrayList<>();

        List<Class> classes = _program.getClasses();
        for (Class c : classes)
        {
            ClassGenerator classGenerator = new ClassGenerator(
                    new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS),
                    c.getName().replace('.', '/'));

            classGenerator.getClassWriter().visit(Opcodes.V1_4, // Java Version (Mini Java is v1.4
                    parseVisibility(c.getAccess()),             // Visibility
                    classGenerator.getName(),                   // Classname
                    null,                               // Signature (no generics/interfaces)
                    "java/lang/Object",
                    null);

            classGenerator.getClassWriter().visitEnd();
            classFiles.add(new ClassFile(c.getName(), classGenerator.getClassWriter().toByteArray()));
        }
        return classFiles;
    }

    /**
     * Parse a visibility modifier to Opcode
     * @param _acces visibility modifier
     * @return Opcode
     */
    private int parseVisibility(@NotNull Access _acces){
        int result = Opcodes.ACC_PUBLIC;
        switch (_acces){
            case PUBLIC:
                break;
            case PRIVATE:
                break;
            default:
                break;
        }
        return result;
    }


    /**
     * Parses a type to a JVM Type Signature
     * @param _type Type name
     * @return JVM Type Signature
     */
    private String parseType(@NotNull Type _type){
        String type = _type.getType().replace('.','/');

        StringBuilder result = new StringBuilder();

        boolean isArray = type.endsWith("[]");
        if(isArray){
            result.append("[");
            type = type.substring(0, type.length() - 3);
        }

        switch (type) {
            case "boolean":
                result.append("Z");
                break;
            case "byte":
                result.append("B");
                break;
            case "char":
                result.append("C");
                break;
            case "short":
                result.append("S");
                break;
            case "int":
                result.append("I");
                break;
            case "long":
                result.append("J");
                break;
            case "float":
                result.append("F");
                break;
            case "double":
                result.append("D");
                break;
            case "void":
                result.append("V");
                break;
            default:
                result.append("L").append(type).append(";");
                break;
        }

        return result.toString();
    }

    //Parse Method return type to JVM Type




    /**
     * Parses Return type to Opcode
     * @param _type Return type
     * @return Type as Opcode
     */
    @Contract(pure = true)
    private int parseReturnType(@NotNull Type _type)
    {
        String type = _type.getType();
        int result;

        switch (type) {
            case "boolean":
            case "byte":
            case "char":
            case "short":
            case "int":
                result = Opcodes.IRETURN;
                break;
            case "long":
                result = Opcodes.LRETURN;
                break;
            case "float":
                result = Opcodes.FRETURN;
                break;
            case "double":
                result = Opcodes.DRETURN;
                break;
            case "void":
                result = Opcodes.RETURN;
                break;
            default:
                result = Opcodes.ARETURN;
                break;
        }

        return result;
    }


    /**
     * Parses the type of a variable to an Opcode
     * @param _type Variable type
     * @return Typa as Opcode
     */
    private int parseVarType(@NotNull Type _type){
        String type = _type.getType();
        int result;
        switch (type) {
            case "boolean":
            case "byte":
            case "char":
            case "short":
            case "int":
                result = Opcodes.INTEGER;
                break;
            case "long":
                result = Opcodes.LONG;
                break;
            case "float":
                result = Opcodes.FLOAT;
                break;
            case "double":
                result = Opcodes.DOUBLE;
                break;
            default:
                result = -1;
                break;
        }

        return result;
    }

    //resolve Statement

    //resolve statementexpression

    //resolve expression

    //resolve Block

    //visitIfStatement

    //visitLocalVarDecl

    //visitReturn

    //visitStatementExpressionStatement

    //visitWhile

    //visitAssign

    //visitMethodCall

    //visitNew

    //visitBinary

    //visitBoolExpr

    //visitChar

    //visitInstVar

    //visitIntExpr

    //visitLocalOrFieldVar

    //visitNullExpr

    //visitStringExpr

    //visitSuper

    //visitThis

    //visitUnary

}
