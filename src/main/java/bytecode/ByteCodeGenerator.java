package bytecode;

import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;

public class ByteCodeGenerator
{

    /*
    public List<ClassFile> generate(@NotNull IPrg _prg)
    {
        // Generate Bytecode
        List<ClassFile> classFiles = new ArrayList<>();

        List<Class> classes = _prg.getClasses();
        for (Class c : classes) {
            ClassGenerator classGenerator = new ClassGenerator(
                    new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS),
                    c.getName().replace('.', '/'));

            classGenerator.getClassWriter().visit(Opcodes.V1_4,                   // Java Version (Mini Java is v1.4
                    parseVisibility(c.getAccess()), // Visibility
                    classGenerator.getName(),       // Classname
                    null,                           // Signature (no generics/interfaces)
                    "java/lang/Object",
                    // TODO: Change to base class if using inheritance
                    null);                          // Interface (not needed)

            // Visit each field
            for (Field f : c.getFields()) {
                String fieldName = f.getName();
                String type = parseType(f.getType());

                classGenerator.getFields().put(fieldName, type);
                FieldVisitor fv = classGenerator.getClassWriter().visitField(
                        parseVisibility(f.getAccess()), // Visibility
                        fieldName,                      // Fieldname
                        type,                           // Type
                        null,                           // Signature (no generics)
                        null);                          // TODO: Value (only statics)
                fv.visitEnd();
            }

            // Visit each method
            for (Method m : c.getMethods()) {
                // Special treatment for constructors
                String name = m.getName().equals(c.getName()) ? "<init>" : m.getName();
                String type = parseMethodType(m.getType(), m.getArguments());

                MethodVisitor mv = classGenerator.getClassWriter().visitMethod(
                        parseVisibility(m.getAccess()), // Visibility
                        name,                           // Methodname
                        type,                           // Type
                        null,                           // Signature (no generics)
                        null);                          // Exceptions (no exceptions)
                mv.visitCode();

                // Actually visit code
                MethodGenerator method = new MethodGenerator(mv, m.getArguments(), m.getName(), classGenerator);
                visitBlockStmt(method, (Block)m.getStatement(), name.equals("<init>"));

                // Return from method
                mv.visitInsn(parseReturnType(m.getType()));

                mv.visitMaxs(0, 0);
                mv.visitEnd();
            }

            classGenerator.getClassWriter().visitEnd();

            classFiles.add(new ClassFile(c.getName(), classGenerator.getClassWriter().toByteArray()));
        }

        return classFiles;
    }*/
}
