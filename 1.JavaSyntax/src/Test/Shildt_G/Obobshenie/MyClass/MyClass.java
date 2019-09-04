package Test.Shildt_G.Obobshenie.MyClass;

/**
 * Created by Антон on 18.04.2017.
 */

//Реализуем обобщенный интерфейс
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }

    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<Integer>(inums);
        MyClass<Character> cOb = new MyClass<Character>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iOb.max());
        System.out.println("Минимальное значение в массиве inums: " + iOb.min());

        System.out.println("Максимальное значение в массиве chs: " + cOb.max());
        System.out.println("Минимальное значение в массиве chs: " + cOb.min());
    }
}
