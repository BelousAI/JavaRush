package Test.Shildt_G.Object_class;

/**
 * Created by Антон on 01.06.2017.
 */
class TestClone implements Cloneable {
    int a;
    double b;

    // В этом методе вызывается метод clone() из класса Object
    TestClone cloneTest() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно");
            return this;
        }
    }

    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = x1.cloneTest(); // клонировть объект x1
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
