package Test.Shildt_G.Figure_extends;



/**
 * Created by Антон on 05.04.2017.
 */
class FindAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10); // теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area() + "\n");

        /*figref = f;
        System.out.println("Площадь равна " + figref.area());*/

        Rectangle.read(); //СТАТИЧЕСКИЕ МЕТОДЫ НАСЛЕДУЮТСЯ, но НЕПЕРЕОПРЕДЕЛЯЮТСЯ!!!(как и стат. методов интерфейса)
        t.method();       //final МЕТОДЫ НАСЛЕДУЮТСЯ, НО ПЕРЕОПРЕДЕЛИТЬ НЕЛЬЗЯ.
                          //Приватные методы НАСЛЕДУЮТСЯ, но НЕПЕРЕОПРЕДЕЛЯЮТСЯ!!!
        System.out.println(r);


    }
}
