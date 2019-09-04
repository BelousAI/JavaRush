package Test.Shildt_G.Exception;

/**
 * Created by Антон on 10.04.2017.
 */
public class ChainExcDemo {
    static void demoproc() {
        //Создаем исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        //Добавляем причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            //Выводим исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            //Выводим причину исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
