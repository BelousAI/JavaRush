package Test.Shildt_G.Reflection.ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Открытые методы: ");
            Method[] methods = c.getDeclaredMethods();

            for (int i = 0; i < methods.length; i++) {
                int modifiers = methods[i].getModifiers();
                if (Modifier.isPublic(modifiers)) {
                    System.out.println(" " + methods[i].getName());
                }
            }

            //меняем значение поля
            Field field = c.getDeclaredField("tmp");
            String s = (String) field.get(a);
            field.set(a, "text");
            String str = (String) field.get(a);
            System.out.println(str);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
