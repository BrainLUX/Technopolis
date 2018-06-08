//ReflectionImplementor - пример простого использования reflection. 
//Код способен наследоваться от переданного названия класса или интерфейса, реализовывать abstract методы и конструкторы его и родителей.
//Входные аргументы (полное имя класса)
import javax.accessibility.Accessible;
import javax.annotation.processing.Completions;
import javax.imageio.IIOException;
import javax.imageio.IIOImage;
import javax.management.ImmutableDescriptor;
import javax.management.remote.rmi.RMIIIOPServerImpl;
import javax.naming.ldap.LdapReferralException;
import javax.sql.rowset.CachedRowSet;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class ReflectionImplementor {
    static File file;
    static PrintStream out;
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
     //   Completions
        try {
            Class cl = Class.forName(args[0]);
            if (Modifier.toString(cl.getModifiers()).contains("final")) {
                System.out.println("Can't implement final class");
                System.exit(0);
            }
            file = new File("src/" + cl.getSimpleName() + "Impl.java");
            file.createNewFile();
            out = new PrintStream(file);
            out.println(Modifier.toString(cl.getModifiers()).replace("abstract", "").replace("transient", "").replace("interface", "") + " class " + cl.getSimpleName() + "Impl" + (cl.isInterface() ? " implements " : " extends ") + cl.getName() + " {\n");
            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                out.print(Modifier.toString(constructor.getModifiers()).replace("transient", "") + " " + cl.getSimpleName() + "Impl" + "( ");
                StringBuilder res = new StringBuilder();
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < constructor.getParameterTypes().length; i++) {
                    String name = (" " + constructor.getParameterTypes()[i].getSimpleName().replace("[", "").replace("]", "")).toUpperCase() + new Random().nextInt(1000);
                    out.print(constructor.getParameterTypes()[i].getTypeName() + (name + (i == constructor.getParameterTypes().length - 1 ? "" : " , ")));
                    res.append(constructor.getParameterTypes()[i].getSimpleName().equals("void") ? " " : (constructor.getParameterTypes()[i].isPrimitive()
                            ? (constructor.getParameterTypes()[i].getSimpleName().equals("boolean") ? "false" : "0") : name));
                    if (i != constructor.getParameterTypes().length - 1)
                        res.append(", ");
                }
                out.print(") throws Exception {");
                out.println();
                if (constructor.getParameterTypes().length > 0)
                    out.println("super(" + res.toString() + ");");
                out.println("}");
            }

            new ReflectionImplementor().implement(cl);
            out.println("}");
            out.close();
            System.out.println(Arrays.toString(list.toArray()));
        } catch (ClassNotFoundException e) {
            System.out.println("Class " + args[0] + " not found");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("No params");
        } catch (IOException e) {
            System.out.println("Error while creating file");
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
    }

    public void implement(Class cl) throws Exception {


        Method[] methods = cl.getMethods();

        for (Method method : methods)
            if (Modifier.isAbstract(method.getModifiers()) && !Modifier.isFinal(method.getModifiers())) {
                System.out.println(Modifier.isFinal(method.getModifiers()) + method.getName());
                //out.print(Modifier.toString(method.getModifiers()).replace("abstract", "") + method.getReturnType().getTypeName() + " " + method.getName() + "(");
                StringBuilder res = new StringBuilder(method.getName() + " ");
                StringBuilder res2 = new StringBuilder(Modifier.toString(method.getModifiers()).replace("abstract", "").replace("transient", "") + method.getReturnType().getTypeName() + " " + method.getName() + "(");
                for (int i = 0; i < method.getParameterTypes().length; i++) {
                    res2.append(method.getParameterTypes()[i].getTypeName()).append((" " + method.getParameterTypes()[i].getSimpleName().replace("[", "").replace("]", "")).toUpperCase()).append(new Random().nextInt(1000)).append(i == method.getParameterTypes().length - 1 ? "" : " , ");
                    res.append(method.getParameterTypes()[i].getTypeName()).append((" " + method.getParameterTypes()[i].getSimpleName().replace("[", "").replace("]", "")).toUpperCase()).append(i == method.getParameterTypes().length - 1 ? "" : " , ");
                }
                if (!list.contains(res.toString())) {
                    out.print(res2);
                    out.print(") "/* + (method.getExceptionTypes().length > 0 ? "throws Exception " : " ")*/ + "{");
                    out.println();
                    out.println("return " + (method.getReturnType().getSimpleName().equals("void") ? " " : (method.getReturnType().isPrimitive()
                            ? (method.getReturnType().getSimpleName().equals("boolean") ? "false" : "0") : "null")) + ";");
                    out.println("}");
                    list.add(res.toString());
                }


            }

        if (cl.getSuperclass() != null) {
            implement(cl.getSuperclass());
        }
        if (cl.getInterfaces().length > 0)
            for (Class claz : cl.getInterfaces())
                implement(claz);
        System.out.println(Arrays.toString(methods));
        System.out.println(file.getAbsolutePath());
    }
}
