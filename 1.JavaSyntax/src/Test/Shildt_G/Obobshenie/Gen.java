package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 17.04.2017.
 */

/*Простой обобщенный класс
Здесь Т обозначает параметр типа,
который будет заменен реальным типом
при создании объекта типа Gen */

class Gen<T> {
    T ob; //объявлен объект типа Т

    //Передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }

    //Возвратить объект ob
    T getOb() {
        return ob;
    }

    //Показать тип Т
    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}
