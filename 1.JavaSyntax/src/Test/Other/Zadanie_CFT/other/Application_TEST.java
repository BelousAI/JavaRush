package Test.Other.Zadanie_CFT.other;

import java.io.*;

public class Application_TEST {
    private static String[] arrayStr;
    private static int[] arrayInt;

    private static void metSortString(String[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j > 0) && ((array[j - 1].compareTo(array[j])) > 0); i--) {
                String arr = array[j - 1];
                array[j - 1] = array[j];
                array[j] = arr;
            }
        }
    }

    private static void metSortPoVozrastInt(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j > 0) && (array[j - 1] > array[j]); j--) {
                int arr = array[j - 1];
                array[j - 1] = array[j];
                array[j] = arr;
            }
        }
    }

    private static void metSortPoUbivaniy(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j > 0) && (array[j - 1] < array[j]); j--) {
                int arr = array[j - 1];
                array[j - 1] = array[j];
                array[j] = arr;
            }
        }
    }

    private static void metSwitch(String str) {
        switch (str) {
            case "-a":
                metSortPoVozrastInt(arrayInt);
                break;

            case "-d":
                metSortPoUbivaniy(arrayInt);
                break;
        }
    }

    private static <T> void metFor(T[] array, PrintWriter writer) {
        for (T value : array) {
            writer.println(value);
        }
    }

    public static void main(String[] args) {
        //File file = new File(args[1]);
        try (BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            PrintWriter writer = new PrintWriter(new FileWriter(args[2]))) {

            switch (args[3]) {
                case "-i":
                    for (int i = 0; reader.ready(); i++) {
                        arrayInt[i] = Integer.parseInt(reader.readLine());
                    }

                    metSwitch(args[4]);//Вызвать метод со свитчем!!!!
                    //metFor(arrayInt, writer);
                    break;

                case "-s":
                    for (int i = 0; reader.ready(); i++) {
                        arrayStr[i] = reader.readLine();
                    }

                    metSortString(arrayStr);

                    for (String str : arrayStr) {
                        writer.write(str + "\n");
                    }
                    break;

                default:
                    System.out.println("Вы ввели не верный формат, введите по новой");
                    //return;
                    System.exit(0);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден/не возможно прочитать файл");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
