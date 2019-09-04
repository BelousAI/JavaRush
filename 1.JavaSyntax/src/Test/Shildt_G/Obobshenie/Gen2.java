package Test.Shildt_G.Obobshenie;

/**
 * Created by Антон on 18.04.2017.
 */

//Демонстрация базового типа
class Gen2<T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    public static void main(String[] args) {
        Gen2<Integer> iOb = new Gen2<Integer>(88);
        Gen2<String> strOb = new Gen2<String>("Тест обобщений");

        //Создаем объект базового типа Gen и присваиваем ему значение типа Double
        Gen2 raw = new Gen2(new Double(98.6));

        //Требуется приведение типов т.к. тип неизвестен
        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);

        //Применение бозового типа может вызвать исключение во время выполнения
        //int i = (Integer) raw.getOb(); //Ошибка во время выполнения!!!!

        strOb = raw; //Верно, но потенциально ошибочно!
        //String str = strOb.getOb(); //Ошибка во время выполнения!!!!

        raw = iOb; //Верно, но потенциально ошибочно!
        d = (Double) raw.getOb(); //Ошибка во время выполнения!!!!
    }
}
