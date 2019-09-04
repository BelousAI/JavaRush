package com.javarush.task.task14.task1408;

/**
 * Created by Антон on 17.02.2017.
 */
public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 15;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
