package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */

//В этой версии класса аргумент типа Т
// д.б. классом Number или наследуемым от него классом
class Stats<T extends Number> {
    T[] nums;

    //передается конструктору ссылка на массив эл-тов
    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    //Определяем равенство двух средних значений
    //Используется метасимвол "?"
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fOb = new Stats<Float>(fnums);
        double x = fOb.average();
        System.out.println("Среднее значение fOb равно " + x);

        //Выясняем какие массивы имеют одинаковые средние значения
        System.out.print("Средние значения iOb и dOb ");
        if (iOb.sameAvg(dOb)) {
            System.out.println("равны.");
        }
        else System.out.println("отличаются.");

        System.out.print("Средние значения iOb и fOb ");
        if (iOb.sameAvg(fOb)) {
            System.out.println("равны.");
        }
        else System.out.println("отличаются.");

        //Этот код не скомпилируется, т.к. класс String
        //не является проиизводным от класса Number
        /*String[] strs = {"1", "2", "3", "4", "5"};
        Stats<String> strOb = new Stats<String>(strs);
        double x = strOb.average();
        System.out.println("Среднее значение strOb равно " + x);*/
    }
}
