package Test.Shildt_G.Object_class;

/**
 * Created by Антон on 01.06.2017.
 */
public class TestClone2 implements Cloneable {
    int a;
    double b;

    //Метод clone() переопределяется теперь как public
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не возможно.");
            return this;
        }
    }

    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = (TestClone2) x1.clone();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
