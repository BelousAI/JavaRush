package Test.Thinking_Java;

/**
 * Created by Антон on 14.03.2017.
 */
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
