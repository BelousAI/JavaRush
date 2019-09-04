package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        //Форматирование целых восьмеричных и шестнад-х чисел
        fmt.format("Шестнадцатеричное число: %x, восьмеричное число: %o \n", 196, 196);
        System.out.println(fmt);

        //вывод чисел с плавающей точкой в шестнад-м формате
        fmt.format("%a", 512.0);
        System.out.println(fmt);
        fmt.close();
    }
}
