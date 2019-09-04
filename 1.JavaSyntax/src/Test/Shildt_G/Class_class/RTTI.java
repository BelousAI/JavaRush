package Test.Shildt_G.Class_class;

/**
 * Created by Антон on 01.06.2017.
 */
public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;

        clObj = x.getClass(); //получить ссылку на объект типа Class
        System.out.println("x - объект типа: " + clObj.getSimpleName());

        clObj = y.getClass();
        System.out.println("y - объект типа: " + clObj.getSimpleName());

        // получить ссылку на объект типа Class для суперкласса
        clObj = clObj.getSuperclass();
        System.out.println("Суперкласс объекта y: " + clObj.getSimpleName());
    }
}
