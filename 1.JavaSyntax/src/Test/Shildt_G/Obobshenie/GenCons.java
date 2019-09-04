package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */

//Используется обобщенный конструктор
class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }

    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5f);

        test.showval();
        test2.showval();
    }
}
