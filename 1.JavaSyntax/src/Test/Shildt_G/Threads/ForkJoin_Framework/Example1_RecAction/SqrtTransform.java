package Test.Shildt_G.Threads.ForkJoin_Framework.Example1_RecAction;

import java.util.concurrent.RecursiveAction;

//Класс ForkJoinTask преобразует (через класс RecursiveAction)
//значения элементов массива типа double в их квадратные корни
public class SqrtTransform extends RecursiveAction {
    /*В данном примере пороговое значение произвольно устанавливается
    * равным 1000. В реальном коде его оптимальное значение может
    * быть определено в результате профилирования исполняющей системы
    * или экспирементально*/
    final int seqThreshold = 1000;

    //обрабатываемый массив
    double[] data;

    //определить часть обрабатываемых данных
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    //этот метод выполняет параллельное вычисление
    @Override
    protected void compute() {

        /*Если количество элементов меньше порогового значения,
        * выполнить дальнейшую обработку последовательно*/
        if ((end - start) < seqThreshold) {
            /*преобразовать значение каждого элемента массива
            * в его квадратный корень*/
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
            /*В противном случае продолжить разделение данных на
            * меньшие части */

            //найти середину
            int middle = (start + end) / 2;

            /*запустить новые подзадачи на выполнение, используя
            * разделенные на части данные*/
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}
