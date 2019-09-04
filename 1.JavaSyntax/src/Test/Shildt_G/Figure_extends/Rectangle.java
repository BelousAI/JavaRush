package Test.Shildt_G.Figure_extends;

/**
 * Created by Антон on 05.04.2017.
 */
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }

    static void read() {
        System.out.println("Вызов статического метода из класса Rectangle");
    }

    public String toString() {
        return getClass().getSimpleName() + "";
    }

    interface A {}
}
