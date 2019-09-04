package Test.Shildt_G.AutoBox;

/**
 * Created by Антон on 11.04.2017.
 */
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb; //После распаковки действуют стандартные правила продвижения и преобразования типов данных
        System.out.println("dOb после выражения: " + dOb);
    }
}
