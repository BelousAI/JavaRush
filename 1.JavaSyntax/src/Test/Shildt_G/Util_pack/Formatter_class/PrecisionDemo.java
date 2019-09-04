package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        //Формат с четырьмя цифрами после десятичной точки
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        //формат с двумя цифрами после десятичной точки
        //в поле из 16 символов
        fmt = new Formatter();
        fmt.format("%16.2e", 123.123456789);
        System.out.println(fmt);
        fmt.close();

        //вывести максимум 15 символов из строки
        fmt = new Formatter();
        fmt.format("%.16s",
                "Форматировать в Java теперь очень просто.");
        System.out.println(fmt);
        fmt.close();
    }
}
