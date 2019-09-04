package Test.Shildt_G;

import java.util.Objects;

/**
 * Created by Антон on 17.04.2017.
 */
public class InstanceOf {
    static class A {
        int i, j;
    }

    static class B {
        int i, j;
    }

    static class C extends A {
        int k;
    }

    static class D extends A {
        int k;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("а является экземпляром А");
        }
        if (b instanceof B) {
            System.out.println("b является экземпляром B");
        }
        if (c instanceof C) {
            System.out.println("с является экземпляром С");
        }
        if (c instanceof A) {
            System.out.println("с можно привести к типу А\n");
        }

        if (a instanceof C) {
            System.out.println("а можно привести к типу С\n");
        }

        //сравнить с порожденными типами
        A ob;

        ob = d;
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D) {
            System.out.println("ob является экземпляром D");
        }
        System.out.println();

        ob = c;
        System.out.println("ob теперь ссылаетсяя на с");
        if (ob instanceof D) {
            System.out.println("ob можно привести к типу D");
        }
        else System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A) {
            System.out.println("ob можно привести к типу A\n");
        }

        //все объекты могут быть приведены к объекту Object
        if (a instanceof Object) {
            System.out.println("a можно привести к типу Object");
        }
        if (b instanceof Object) {
            System.out.println("b можно привести к типу Object");
        }
        if (c instanceof Object) {
            System.out.println("c можно привести к типу Object");
        }
        if (d instanceof Object) {
            System.out.println("d можно привести к типу Object");
        }
    }
}
