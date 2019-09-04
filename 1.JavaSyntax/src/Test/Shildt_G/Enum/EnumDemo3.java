package Test.Shildt_G.Enum;

/**
 * Created by Антон on 10.04.2017.
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        //Apple ap;

        //Выводим цену яблок сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " + Apple2.Winesap.getPrice() + " центов.\n");

        //Выводим цены на все сорта яблок
        System.out.println("Цены на все сорта яблок :");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}
