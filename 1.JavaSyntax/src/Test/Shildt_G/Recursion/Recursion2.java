package Test.Shildt_G.Recursion;

/**
 * Created by Антон on 03.04.2017.
 */
public class Recursion2 {
    int[] values;

    Recursion2(int i) {
        values = new int[i];
    }

    //Вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }

    public static void main(String[] args) {
        Recursion2 ob = new Recursion2(10);
        int i;

        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }

        ob.printArray(10);
    }
}
