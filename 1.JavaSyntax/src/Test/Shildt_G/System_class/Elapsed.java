package Test.Shildt_G.System_class;

/**
 * Created by Антон on 17.05.2017.
 */
//Измерение времени выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Измерение времени перебора от 0 до 100 000 000");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000L; i++);
        end = System.currentTimeMillis();

        System.out.println("Время выполнения: " + (end - start));
    }
}
