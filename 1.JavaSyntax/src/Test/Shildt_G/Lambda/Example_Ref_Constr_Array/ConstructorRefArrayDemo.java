package Test.Shildt_G.Lambda.Example_Ref_Constr_Array;

/**
 * Created by Антон on 24.04.2017.
 */
public class ConstructorRefArrayDemo {
    public static void main(String[] args) {
        //Создаем ссылку на конструктор создания массива
        MyArrayCreator<MyClass[]> myArrayCons = MyClass[]::new;

        MyClass[] mc = myArrayCons.func(2); //Создание двухэлементного массива
        mc[0] = new MyClass(1);
        mc[1] = new MyClass(2);
        //mc[2] = new MyClass(3);
    }
}
