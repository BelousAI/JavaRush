package Test.Shildt_G.Lambda.Example_Ref_Constr_Obobsh2;

/**
 * Приближен к практическому применению!!!!!!!!!!!!
 */

//Фабричный метод для объектов разных классов.
//У каждого класса д.б. свой конструктор, принимающий один
// параметр типа Т. А параметр R обозначает тип созд-го объекта
public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        //Создание ссылки на конструктор класса MyClass
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        //Создаем экземпляр типа класса MyClass c помощью фабричного метода
        MyClass mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        //Создаем экземпляр др. класса
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение val в объекте mc2 равно " + mc2.getStr());

    }
}
