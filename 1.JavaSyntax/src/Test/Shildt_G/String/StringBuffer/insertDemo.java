package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 02.05.2017.
 */
public class insertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне Java!");

        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
