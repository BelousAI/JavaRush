package Test.Shildt_G.Box_extends;

/**
 * Created by Антон on 05.04.2017.
 */
public class BoxWeight extends Box {
    double weight;

    //Сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
