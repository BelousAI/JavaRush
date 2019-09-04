package Test.Other.Outer;

/**
 * Created by Антон on 26.06.2017.
 */
public class Outer {
    private int f = 10;

    private Inner inner = new Inner();
    //private Outer outer = new Outer(); //Приведет к переполнеению стека!!!

    class Inner {
        int x = 5;

        int method() {
            return f;
        }
    }

    static class StaticClass {
        void method2() {
            System.out.println("Статический метод");
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Inner in = out.new Inner();
        System.out.println(in.x);
        System.out.println(in.method());

        StaticClass sc = new StaticClass();
        Outer.StaticClass sc2 = new StaticClass();

        sc.method2();
        sc2.method2();
    }
}
