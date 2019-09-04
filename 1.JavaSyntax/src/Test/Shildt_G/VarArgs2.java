package Test.Shildt_G;

/**
 * Created by Антон on 04.04.2017.
 */
public class VarArgs2 {

    // v - Параметр переменной длины
    public static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длины: ", 10);
        vaTest("Три параметра переменной длины: ", 1, 2, 3);
        vaTest("Без параметров переменной длины: ");
    }
}
