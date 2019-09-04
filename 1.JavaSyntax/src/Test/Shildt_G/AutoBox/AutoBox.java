package Test.Shildt_G.AutoBox;

/**
 * Created by Антон on 10.04.2017.
 */
public class AutoBox {
    static int m(Integer v) {
        return v; //Автораспаковка значения типа int
    }
    public static void main(String[] args) {
        Integer iOb = 100;                 //Автоупаковка значения типа int
        int i = iOb;                       //Автораспаковка значения типа int
        System.out.println(i + " " + iOb + "\n");

        Integer iOb2 = m(101);
        System.out.println(iOb2);
    }
}
