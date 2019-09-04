package Test.Shildt_G.Threads.Highlevel_Synchronize.Phaser2;

import java.util.concurrent.Phaser;

//Расширить класс MyPhaser, чтобы выполнить
//только определенное количество фаз
public class MyPhaser extends Phaser {
    private int numPhases;

    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    /*
    * определить метод onAdvance(), чтобы выполнить
    * определенное количество фаз*/
    protected boolean onAdvance(int p, int regParties) {
        /*Следующий оператор println() требуется только для
        * целей иллюстрации. Как правило, метод onAdvance()
        * не отображает выводимые данные*/
        System.out.println("Фаза " + p + " завершина\n");

        /*Возвратить логическое значение true,
        * если все фазы завершены*/
        if (p == numPhases || regParties == 0) return true;

        //В противном случае возвратить логическое значение false
        return false;
    }
}
