package Test.Shildt_G.Figure_extends;

/**
 * Created by Антон on 05.04.2017.
 */
class Triangle extends Figure implements Rectangle.A {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
