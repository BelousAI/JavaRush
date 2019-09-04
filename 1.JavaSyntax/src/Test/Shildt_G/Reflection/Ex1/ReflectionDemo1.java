package Test.Shildt_G.Reflection.Ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.awt.Dimension");
            System.out.println("Конструкторы: ");
            Constructor[] constructors = c.getConstructors();
            for (Constructor con : constructors) {
                System.out.println(" " + con);
            }

            System.out.println("Поля: ");
            Field[] field = c.getFields();
            for (Field f : field) {
                System.out.println(" " + f);
            }

            System.out.println("Методы: ");
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                System.out.println(" " + m);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
