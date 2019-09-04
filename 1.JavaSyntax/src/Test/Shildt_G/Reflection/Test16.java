package Test.Shildt_G.Reflection;

import Test.Other.A;
import Test.Other.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Антон on 20.06.2017.
 */
public class Test16 {
    public static void main(String[] args) throws Exception {
        String name = Object[].class.getName();
        System.out.println(name);

        //Является ли класс вложенным?
        Class c = Class.forName("Test.Shildt_G.Box_extends.Box");
        if (c.isMemberClass()) {
            System.out.println("it`s member class");
        }
        System.out.println(c.getSimpleName());

        //Получаем модификатор класса
        int modifiers = c.getModifiers();
        if (!(Modifier.isPublic(modifiers))) {
            System.out.println("this class is not Public!");
        }

        //Находим Public поля класса
        //Field[] fields = c.getFields(); //надодит все public поля
        //Field f = c.getField("PublicField"); //находим public поле по имени

        Field[] fields = c.getDeclaredFields();//Находим все поля
        for (Field fi : fields) {
            System.out.println(fi);
        }

        Field f = c.getDeclaredField("width"); //Находим конкретное поле по имени
        ////////////////////////////////////////////////////////

        A a = new A();
        Field field = a.getClass().getDeclaredField("name");
        field.setAccessible(true);                                  //дает доступ к private полям
        String value = (String) field.get(a);
        System.out.println(value);

        field.set(a, "Anton");
        a.print();
    }
}
