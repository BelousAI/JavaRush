package Test.Shildt_G.Util_pack;

/**
 * Created by Антон on 06.06.2017.
 */
import java.util.*;

//Создаем массив для хранения битов в виде (true/false)
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        //Установить некоторые биты
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) bits1.set(i);
            if (i % 5 != 0) bits2.set(i);
        }
        System.out.println("Начальная комбинация битов в объекте bits1: ");
        System.out.println(bits1);
        System.out.println("\nНачальная комбинация битов в объекте bits2: ");
        System.out.println(bits2);

        //выполнить логическую операцию И над битами
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        //Выполнить логическую операцию ИЛИ над битами
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        //Выполнить логическую операцию исключающее ИЛИ над битами
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}
