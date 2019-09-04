package Test.Shildt_G.Lambda.Example_Ref_NotStatic_Meth2;

/**
 * Created by Антон on 21.04.2017.
 */
class InstanceMethWithObjectRefDemo {
    //Метод, возвращающий количество экземпляров объекта,
    //найденных по критериям, задаваемым параметром функционального интерфейса MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;        //!!!!!!!!!!!!!!!!!!!!!!!!!Шилдт стр. 455!!!!!!!!!!!!!!!
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        //Создаем массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                                   new HighTemp(90), new HighTemp(89),
                                   new HighTemp(89), new HighTemp(91),
                                   new HighTemp(84), new HighTemp(83)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " + count);

        //Еще один массив
        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + count);

        //Используем метод lessThanTemp()
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: " + count);
    }
}
