package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 28.04.2017.
 */

//Демонстрация методов charAt(), setCharAt() и setLength()
public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер до = " + sb);
        System.out.println("до вызова charAt(1) = " + sb.charAt(1)); //копирует символ по индексу 1

        sb.setCharAt(1, 'i'); //замена символа по индексу
        sb.setLength(2); //установка опред длинны симв. строки
        System.out.println("буфер после = " + sb);
        System.out.println("после вызова charAt(1) = " + sb.charAt(1));

    }
}
