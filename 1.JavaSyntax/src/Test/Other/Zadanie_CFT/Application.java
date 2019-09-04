package Test.Other.Zadanie_CFT;

import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StringBuilder info = new StringBuilder();
        info.append("\nВведите через пробел 4 аргумента:\n")
                .append("1 - путь к входному файлу;\n")
                .append("2 - путь к выходному файлу;\n")
                .append("3 - тип содержимого файла: -i (целые числа), -s (строки);\n")
                .append("4 - режим сортировки: -а (по возрастанию), -d (по убыванию), для строк только -a;\n")
                .append("Внимание!!! Строки сортируются только в лексикографическом порядке" +
                        " (по кодам символов).\n");

        try {
            if (args.length != 4) {
                throw new IncorrectArgException("Введено неверное колличество аргументов!\n");
            }

            boolean isNumber;
            boolean isAscending;

            switch (args[2]) {
                case "-i":
                    isNumber = true;
                    break;
                case "-s":
                    isNumber = false;
                    break;
                default:
                    throw new IncorrectArgException("Некорректный 3-й аргумент!\n");
            }

            switch (args[3]) {
                case "-a":
                    isAscending = true;
                    break;
                case "-d":
                    isAscending = false;
                    break;
                default:
                    throw new IncorrectArgException("Некорректный 4-й аргумент!\n");
            }

            try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
                 PrintWriter writer = new PrintWriter(new FileOutputStream(args[1]))) {

                if (isNumber) {
                    ArrayList<Integer> listInt = new ArrayList<>(100);
                    while (scanner.hasNextInt()) {
                        listInt.add(scanner.nextInt());
                    }
                    listInt.trimToSize();

                    if (isAscending) {
                        sort(listInt, new ComparatorInt());
                    } else {
                        sort(listInt, new ComparatorInt().reversed());
                    }
                    printToFile(listInt, writer);
                } else {
                    ArrayList<String> listStr = new ArrayList<>(100);
                    while (scanner.hasNextLine()) {
                        listStr.add(scanner.nextLine());
                    }
                    listStr.trimToSize();

                    if (isAscending) {
                        sort(listStr, new ComparatorStr());
                    } else {
                        //sort(listStr, new ComparatorStr().reversed());
                        throw new IncorrectArgException("Некорректный режим сортировки строк!\n");
                    }
                    printToFile(listStr, writer);
                }
                System.out.println("Программа завершена.");

            } catch (FileNotFoundException e) {
                System.out.println("Входной файл не найден!\n" + info);
            }
        }
        catch (IncorrectArgException e) {
            System.out.println(e.getMessage() + info);
        }
    }

    private static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (comparator.compare(list.get(j - 1), list.get(j)) > 0) {
                    //Collections.swap(list, (j - 1), j);
                    T temp = list.get(j - 1);
                    list.set((j - 1), list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static <T> void printToFile(ArrayList<T> list, PrintWriter writer) {
        for (T value : list) {
            writer.println(value);
        }
    }
}
