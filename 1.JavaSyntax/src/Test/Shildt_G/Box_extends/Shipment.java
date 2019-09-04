package Test.Shildt_G.Box_extends;

/**
 * Created by Антон on 05.04.2017.
 */
public class Shipment extends BoxWeight {
    double cost;

    //Сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
