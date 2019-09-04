package Test.Shildt_G.javadoc;

import java.io.*;

/**
 * В этом классе демонстрируется применение
 * документирующих комментариев
 * @author Герберт Шилдт
 * @version 1.2
 */
public class SquareNum {
    /**
     * Этот метод возвращает квадрат числа.
     * (Это многострочное описание. В нем можно ввести
     * столько строк, сколько потребуется.)
     * @param num Значение, которое требуется возвести в квадрат
     * @return num Значение, возведенное в квадрат
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * Этот метод вводит число, заданное пользователем
     * @return Введенное значение типа double
     * @exception IOException Если при вводе возникает ошибка, то
     *            генерируется исключение типа IOException
     * @see IOException
     */
    public double getNumber() throws IOException {
        //Создать буферизированный поток чтения
        //типа BufferedReader, используя стандартный
        //поток ввода System.in
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        String str = inData.readLine();
        return Double.parseDouble(str);
    }

    /**
     * Этот метод демонстрирует применение метода square()
     * @param args Не используется
     * @exception IOException Если при вводе возникает ошибка, то
     *            генерируется исключение типа IOException
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Введите значение для возведениия в квадрат: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Квадрат значения равен " + val);
    }
}
