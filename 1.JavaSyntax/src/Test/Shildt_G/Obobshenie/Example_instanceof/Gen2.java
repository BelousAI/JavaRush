package Test.Shildt_G.Obobshenie.Example_instanceof;

/**
 * Created by Антон on 18.04.2017.
 */
public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    public static void main(String[] args) {
        //Создаем объект типа Gen
        Gen<Integer> iOb = new Gen<Integer>(88);

        //Создаем объект типа Gen2
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        //Создаем объект типа Gen2
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        }

        if (iOb2 instanceof Gen<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        }

        if (strOb2 instanceof Gen2<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen2");
        }

        if (strOb2 instanceof Gen<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        }
        System.out.println();

        //Совсем не так
        if (iOb instanceof Gen2<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen2");
        }

        //Что так и есть
        if (iOb instanceof Gen<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen");
        }

        //Код не скомпилируется, т.к. сведения об обобщ-м типе
        //отсутствуют во время выполнения
        /*if (iOb2 instanceof Gen2<Integer>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2<Integer>");
        }*/

        iOb = iOb2;
        iOb2 = (Gen2<Integer>) iOb;
        System.out.println(iOb2.getClass().getName());
    }
}
