package Test.Shildt_G.Runtime;

/**
 * Created by Антон on 17.05.2017.
 */
public class ProcessBuilder_test {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("Notepad.exe", "testfile"); //создаст нов файл testfile.TXT
            proc.start();
        }
        catch (Exception e) {
            System.out.println("Ошибка запуска Nodepad.");
        }
    }
}
