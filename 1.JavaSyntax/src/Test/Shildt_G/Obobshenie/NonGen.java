package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */

//Класс NonGen - функциональный эквивалент класса Gen без обобщений
class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}
