package Test.Shildt_G.Anonymous;

/**
 * Created by Антон on 20.06.2017.
 */

//Демонстрация локального класса

public class LocalnyeClassy {
    private int x;

    public void f() {
        /**
         * Локальные классы ведут себя как анонимн,
         * но имеют имя
         */
        class B {
            public void foo() {
                System.out.println(x);
            }
        }

        /**
         * Объявлять их можно в любом блоке
         * внутри метода – в циклах, if’ах и т.д.
         */
        B in = new B();
    }
}
