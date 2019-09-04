package Test.Shildt_G.Enum;

/**
 * Created by Антон on 10.04.2017.
 */
public enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // цена яблока каждого сорта

    //Конструктор
    Apple2(int p) {
        price = p;
    }

    Apple2() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
