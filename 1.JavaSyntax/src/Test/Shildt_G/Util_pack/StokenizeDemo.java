package Test.Shildt_G.Util_pack;

/**
 * Created by Антон on 06.06.2017.
 */
import java.util.*;

//Разбираем строку символов на лексемы(части) по опред-м разделителям
public class StokenizeDemo {
    static String in = "Название=Java. Полное руководство;" +
                       "Автор=Шилдт;" +
                       "Издательство=McGraw-Hill;" +
                       "Авторское право=2014";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;"); // "=;" это разделители
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + " " + val);
        }
    }
}
