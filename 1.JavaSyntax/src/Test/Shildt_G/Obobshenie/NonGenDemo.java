package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);
        iOb.showType();

        //Требуется приведение типов!!
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();

        //Требуется приведение типов!!
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

        //Этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getOb(); //Ошибка вскрывается только во время выполнения.
    }
}
