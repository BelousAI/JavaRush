package Test.Shildt_G.Threads.Highlevel_Synchronize.Exchanger;

import java.util.concurrent.Exchanger;

//Поток формирующий символьную строку
public class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;
    MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = "";
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            //заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }

            try {
                //обменять заполненный буфер на пустой
                str = ex.exchange(str);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
