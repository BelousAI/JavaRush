package Test.Shildt_G.String.StringBuffer;

/**
 * Created by Антон on 05.05.2017.
 */

//Демонстрация удаления
public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");

        sb.delete(3, 11);
        System.out.println("После вызова delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова deleteCharAt(): " + sb);
    }
}
