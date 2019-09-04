package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */

//Демонстрация простого обобщенного метода
public class GenMethDemo {
    //Определить содержится ли объект в массиве
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Применить метод isIn() для целых чисел
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("Число 2 содержится в массиве nums.");
        }

        if (!isIn(7, nums)) {
            System.out.println("Число 7 не содержится в массиве nums.");
        }
        System.out.println();

        //Применить метод isIn() для символьных строк
        String[] strs = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два", strs)) {
            System.out.println("два содержится в массиве strs.");
        }

        if (!isIn("семь", strs)) {
            System.out.println("семь отсутствует в массиве strs.");
        }

        //Не скомпилируется! Типы д.б. совместимы!!!
        /*if (isIn("два", nums)) {
            System.out.println("два содержится в массиве  strs.");
        }*/
    }

}
