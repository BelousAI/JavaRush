package Test.Shildt_G.Reflection;

import java.lang.reflect.Constructor;

/**
 * Created by Антон on 22.06.2017.
 */

//Создание экземпляра класса с private конструктором
public class MyClassDemo {
    public static void main(String[] args) throws Exception {
        Class c = MyClass.class;
        Constructor constr = c.getDeclaredConstructor(int.class, String.class);
        constr.setAccessible(true);
        MyClass obj = (MyClass) constr.newInstance(3, "Hello!");
        System.out.println(obj);

        /*MyClass mc = new MyClass(5, "Hi!"); //Невозможно создать объект!!!
        System.out.println(mc);*/


        //Создаем кучу экземпляров Синглтон класса Single!!!
        Class cs = Single.class;
        Constructor con = cs.getDeclaredConstructor(int.class);
        con.setAccessible(true);
        Single s1 = (Single) con.newInstance(10);
        s1.print();
        Single s2 = (Single) con.newInstance(15);
        s2.print();
        System.out.println(s1 == s2);

        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        System.out.println(single1 == single2);
        System.out.println(constr);
    }
}
