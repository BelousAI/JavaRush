package Test.Shildt_G.Enum;

/**
 * Created by Антон on 10.04.2017.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        //Выводим значения перечислимого типа
        System.out.println("Значение ap: " + ap + "\n");

        ap = Apple.GoldenDel;

        //Сравниваем два значения перечислимого типа
        if (ap == Apple.GoldenDel) {
            System.out.println("Переменная ap содержит GoldenDel.\n");
        }

        //Применяем перечисление для управления оператором Switch
        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт GoldenDel желтый.");
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный.");
                break;
        }
    }
}
