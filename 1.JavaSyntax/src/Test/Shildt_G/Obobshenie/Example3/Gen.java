package Test.Shildt_G.Obobshenie.Example3;

/**
 * Created by Антон on 18.04.2017.
 */

//Обобщенный подкласс
public class Gen<T> extends NonGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }

    public static void main(String[] args) {
        //Создать объект типа Gen для символьных строк
        Gen<String> w = new Gen<String>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
