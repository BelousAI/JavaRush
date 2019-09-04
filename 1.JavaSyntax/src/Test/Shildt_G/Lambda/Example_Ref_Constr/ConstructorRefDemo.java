package Test.Shildt_G.Lambda.Example_Ref_Constr;

/**
 * Created by Антон on 21.04.2017.
 */

//Применение ссылки на конструктор
public class ConstructorRefDemo {
    public static void main(String[] args) {
        //Создать ссылку на конструктор класса MyClass.
        //Метод func() из интерфейса принимает аргумент,
        //поэтому оператор new обращается к параметризованному
        //конструктору класса MyClass, а не к его конструктору по умолчанию
        MyFunc myClassCons = MyClass::new;

        //Создаем экземпляр класса MyClass по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);

        //Или
        MyClass mc2 = new MyClass(101);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
