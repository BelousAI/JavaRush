package Test.Shildt_G.Util_pack;

/**
 * Created by Антон on 06.06.2017.
 */

import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) array[i] = -3 * i;

        //Вывести, отсортировать и снова вывести содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        //Заполнитьь массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        //Отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        //Выполнить двоичный поиск значениия -9
        System.out.print("Значение -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    private static void display(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
