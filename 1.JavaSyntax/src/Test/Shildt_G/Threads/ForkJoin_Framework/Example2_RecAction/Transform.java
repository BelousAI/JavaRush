package Test.Shildt_G.Threads.ForkJoin_Framework.Example2_RecAction;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    //порог последовательного выполнения
    int seqThreshold;

    double[] data;
    int start, end;

    public Transform(double[] data, int start, int end, int seqThreshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.seqThreshold = seqThreshold;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            /*В следующем фрагменте кода элементу по четному
            * индексу присваивается квадратный корень
            * его первоначального значения, а элементу по нечетному
            * индексу - кубический корень его первоначального значения.*/
            for (int i = start; i < end; i++) {
                if ((i % 2) == 0) {
                    data[i] = Math.sqrt(data[i]);
                }
                else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        }
        else {
            //В противном случае продолжить разделение данных на
            //меньшие части

            //середина
            int middle = (start + end) / 2;

            //запуск нов подзадач
            invokeAll(new Transform(data, start, middle, seqThreshold),
                      new Transform(data, middle, end, seqThreshold));
        }
    }
}
