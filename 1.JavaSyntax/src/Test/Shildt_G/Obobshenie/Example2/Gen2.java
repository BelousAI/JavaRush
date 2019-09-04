package Test.Shildt_G.Obobshenie.Example2;

/**
 * Created by Антон on 18.04.2017.
 */
public class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }

    public static void main(String[] args) {

        //Создаем объект типа Gen2 для символьных строк и целых чисел
        Gen2<String, Integer> x = new Gen2<String, Integer>("Значение равно: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
