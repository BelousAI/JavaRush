package Test.Shildt_G.Obobshenie.Example_ogranicheny;

/**
 * Created by Антон on 19.04.2017.
 */
class GenArray<T extends Number> {
    T ob;

    T[] vals;

    GenArray(T o, T[] nums) {
        ob = o;
        //vals = new Solution[10];   //Недопустимо!!!
        vals = nums;
    }

    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};

        GenArray<Integer> iOb = new GenArray<>(50, n);

        //Нельзя создать массив специфических для типа обобщенных ссылок
        //GenArray<Integer>[] gens =  new GenArray<Integer>[10]; //Неверно!!!

        GenArray<?>[] gens = new GenArray<?>[10]; //Верно!!!
    }
}
