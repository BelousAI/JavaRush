package com.javarush.task.task14.task1408;

/**
 * Created by Антон on 17.02.2017.
 */
public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 20;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
