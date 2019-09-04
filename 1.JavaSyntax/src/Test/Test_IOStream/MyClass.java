package Test.Test_IOStream;

import java.util.ArrayList;

/**
 * Created by Антон on 01.03.2017.
 */
public class MyClass {
    ArrayList<Integer> list = new ArrayList<>();

    void write(int data) {
        list.add(data);
    }

    int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    int available() {
        return list.size();
    }
}
