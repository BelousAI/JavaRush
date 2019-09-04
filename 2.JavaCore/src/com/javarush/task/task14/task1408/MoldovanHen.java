package com.javarush.task.task14.task1408;

/**
 * Created by Антон on 17.02.2017.
 */
public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 25;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
