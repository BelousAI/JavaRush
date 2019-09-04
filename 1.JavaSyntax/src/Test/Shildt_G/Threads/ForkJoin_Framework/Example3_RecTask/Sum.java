package Test.Shildt_G.Threads.ForkJoin_Framework.Example3_RecTask;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    //Определить сумму значений элементов в массиве

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else {
            //разделение на меньшие части
            int middle = (start + end) / 2; //середина

            //разделение данных на части
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            //запустить каждую подзадачу путем разветвления
            // (метод fork() - значит без ожидания окончания)
            subTaskA.fork();
            subTaskB.fork();

            //ожидать завершения подзадач и накопить результаты
            sum = subTaskA.join() + subTaskB.join();
        }
        //возвратить конечную сумму
        return sum;
    }
}
