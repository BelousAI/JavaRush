package Test.Shildt_G.Lambda.Example_Ref_Constr_Obobsh;

/**
 * Демонстрация примера для теории!!!
 */
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        //Создаем ссылку на конструктор обобщенного класса
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        //Создаем экземпляр класса MyClass<Solution>
        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
