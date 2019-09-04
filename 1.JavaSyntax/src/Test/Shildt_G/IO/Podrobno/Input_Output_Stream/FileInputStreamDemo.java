package Test.Shildt_G.IO.Podrobno.Input_Output_Stream;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream(
                "D:\\JavaRushTasks\\1.JavaSyntax\\src\\Test\\Shildt_G\\" +
                        "IO\\Podrobno\\FileInputStreamDemo.java")) {
            System.out.println("Общее кол-во доступных байтов: " + (size = f.available()));
            int n = size/40;
            System.out.printf("Первые %d байтов, прочит-ных из файла по очереди методом read()\n", n);

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nВсе еще доступно: " + f.available());

            System.out.printf("Чтение следующих %d байтов по очереди методом read(b[])\n", n);
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + " байтов.");
            }
            System.out.println(new String(b, 0, n));

            System.out.println("\nВсе еще доступно: " + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip()");
            f.skip(size/2);
            System.out.println("Все еще доступно: " + f.available());

            System.out.println("Чтение " + n/2 + " байтов размещенных в конце массива");
            if (f.read(b, n/2, n/2) != n/2) {
                System.err.println("Нельзя прочитать " + n/2 + " байтов.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно: " + f.available());

            System.err.print("fuck!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Невозможно прочитать файл");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
