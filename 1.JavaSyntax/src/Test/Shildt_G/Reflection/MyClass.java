package Test.Shildt_G.Reflection;

import java.lang.reflect.Constructor;

/**
 * Created by Антон on 22.06.2017.
 */

//Создание экземпляра класса с private конструктором
public class MyClass {
    private int x;
    private String name;

    private MyClass(int x, String name) {
        this.x = x;
        this.name = name;
    }

    public String toString() {
        return "Объект класса MyClass c полями: " +
                x + " и " + name;
    }
}
