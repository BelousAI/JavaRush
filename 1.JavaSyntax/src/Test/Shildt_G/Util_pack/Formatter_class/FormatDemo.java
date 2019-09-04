package Test.Shildt_G.Util_pack.Formatter_class;

/**
 * Created by Антон on 07.06.2017.
 */
import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Форматировать %s просто %d %f", "средствами Java", 10, 98.6);
        System.out.println(fmt);
        fmt.close();
    }
}
