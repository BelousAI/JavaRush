package Test.Shildt_G.Enum;

/**
 * Created by Антон on 10.04.2017.
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        //Получаем все порядковые значения с помощью метода ordinal()
        System.out.println("Все константы сортов яблок и их порядковые значения: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        //Применение методов:
        // compareTo() - сравнивает порядковые значния констант одного и того же перечисления
        if (ap.compareTo(ap2) < 0) System.out.println(ap + " предшествует " + ap2);
        if (ap.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap);
        if (ap.compareTo(ap3) == 0) System.out.println(ap + " равно " + ap3);
        System.out.println();

        // equals() - сравнивает на равенство константу перечислимого типа с любым др. объектом
        if (ap.equals(ap2)) System.out.println("Ошибка!");
        if (ap.equals(ap3)) System.out.println(ap + " равно " + ap3);
        if (ap == ap3) System.out.println(ap + " == " + ap3);
    }
}
