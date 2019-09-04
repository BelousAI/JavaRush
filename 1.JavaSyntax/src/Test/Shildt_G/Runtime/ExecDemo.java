package Test.Shildt_G.Runtime;

/**
 * Created by Антон on 17.05.2017.
 */

//Запуск безымянного блокнота
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor();             //прикладная программа (она же наш исходный код) будет ждать закрытия блокнота
        }
        catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }

        System.out.println("Notepad возвратил " + p.exitValue()); //Затем, возвратит значение, возвращаемое по завершении
        //процесса (0 - это хорошо!)
    }
}
