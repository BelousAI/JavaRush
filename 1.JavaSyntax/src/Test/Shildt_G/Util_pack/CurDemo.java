package Test.Shildt_G.Util_pack;

/**
 * Created by Антон on 07.06.2017.
 */

import java.util.*;

public class CurDemo {
    public static void main(String[] args) {
        Currency c = Currency.getInstance(Locale.US);
        System.out.println("Символ: " + c.getSymbol());
        System.out.println(
                "Количество цифр в дробной части числа по умолчанию: " +
                        c.getDefaultFractionDigits());

    }
}
