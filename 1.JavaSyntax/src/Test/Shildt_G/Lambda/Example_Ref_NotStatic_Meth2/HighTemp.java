package Test.Shildt_G.Lambda.Example_Ref_NotStatic_Meth2;

/**
 * Created by Антон on 21.04.2017.
 */

//Класс для хранения макс температуры за день
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {hTemp = ht;}

    //Возвращает true, если вызывающий объект типа HighTemp
    //имеет такую же темпер как и у объекта ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    //  -//-, имеет температуру ниже, чем у объекта ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
