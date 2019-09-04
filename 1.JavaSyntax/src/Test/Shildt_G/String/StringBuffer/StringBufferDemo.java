package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 28.04.2017.
 */

//Определение длины и емкости объекта StringBuffer
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер = " + sb);
        System.out.println("длина = " + sb.length());
        System.out.println("емкость = " + sb.capacity()); //емкость буфера

        sb.ensureCapacity(100);             //выделяем мин. размер буфера
        System.out.println("емкость2 = " + sb.capacity());
    }
}
