package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 05.05.2017.
 */

//Замена
public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");
        sb.replace(4, 11, "был");
        System.out.println("После замены: " + sb);

        //Копирует подстроку последовательности символов в перем String
        String str = sb.substring(4, 7);
        System.out.println(str);
    }
}
