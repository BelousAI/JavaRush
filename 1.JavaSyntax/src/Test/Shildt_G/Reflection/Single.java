package Test.Shildt_G.Reflection;

/**
 * Created by Антон on 22.06.2017.
 */
public class Single {
    private static Single ourInstance = new Single(3);
    private int x;

    public static Single getInstance() {
        return ourInstance;
    }

    private Single(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println(x);
    }
}
