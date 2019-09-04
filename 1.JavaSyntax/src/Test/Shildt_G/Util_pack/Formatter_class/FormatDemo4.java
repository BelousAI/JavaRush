package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.Formatter;

public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(fmt);
        fmt.close();
    }
}
