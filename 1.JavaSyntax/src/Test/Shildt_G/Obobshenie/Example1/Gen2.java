package Test.Shildt_G.Obobshenie.Example1;

/**
 * Created by Антон on 18.04.2017.
 */
public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    T getOb() {
        System.out.print("Метод getOb() из класса Gen2: ");
        return ob;
    }

    T getObSuper() {
        return super.getOb();
    }

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);

        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getObSuper());
        System.out.println(strOb2.getOb());
    }
}
