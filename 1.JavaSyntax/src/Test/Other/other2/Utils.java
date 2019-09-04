package Test.Other.other2;

public class Utils {
    public static void f(B b) {
        //do something
    }

    public static void main(String[] args) {
        A a = new A();
        //f(a);

        B b = new B();
        f(b);

        A c = new B();
        f((B)c);

        System.out.println(c instanceof A);
    }
}
