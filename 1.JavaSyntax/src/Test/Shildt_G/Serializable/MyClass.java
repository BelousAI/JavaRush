package Test.Shildt_G.Serializable;

import java.io.Serializable;

/**
 * Created by Антон on 21.06.2017.
 */
public class MyClass implements Serializable {
    private String s;
    private int i;
    private transient double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s = " + s + "; i = " + i + "; d = " + d;
    }
}
