package Test.Shildt_G;

/**
 * Created by Антон on 30.03.2017.
 */
public class Comma_for {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Пример №2

        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Пример №3

        int sum = 0;
        int[][] nums = new int[3][5];

        //Присваиваем значения элементам массива nums
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                nums[x][y] = (x + 1) * (y + 1);
            }
        }

        for (int[] k : nums) {
            for (int l : k) {
                System.out.println("Значение равно = " + l);
                sum += l;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
