package Test.Shildt_G.Lambda.Example_Lambda_argum;

/**
 * Created by Антон on 20.04.2017.
 */

//Передать лямбда-выражение в кач-ве аргумента методу
public class LambdaAsArgumentsDemo {
    //Первый элемент этого метода имеет тип функционального
    //интерфейса. А второй параметр обозначает обраб-ую символьную строку
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражение повышают эффективность Java";
        String outStr;
        System.out.println("Это исходная строка: " + inStr);

        //Простое лямбда-выражение, преобразующее
        //в верхний регистр букв все символы исходной строки,
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        //А здесь передается блочное лябда-выражение, удаляющее
        //пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Это строка с удаленными бробелами: " + outStr);

        //Использование ссылки на экземпляр интерфейса StringFunc
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i <= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        //А теперь ссылку reverse можно передать в кач-ве первого параметра методу
        outStr = stringOp(reverse, inStr);
        System.out.println("Это обращенная строка: " + outStr);
    }
}
