package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 17.04.2017.
 */
class GenDemo {
    public static void main(String[] args) {
        //Объявляем ссылочную переменную типа Gen для целых чисел
        Gen<Integer> iOb;

        //Создаем объект и присваиваем переменной
        //Автоупаковка 88 в Integer
        iOb = new Gen<Integer>(88);

        //Показать тип данных хранящихся в переменной iob
        iOb.showType();

        //Получить значение переменной iob без явного приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: " + str);

        //iOb = strOb; - Ошибка определена на стадии компилировании кода!!!
    }
}
