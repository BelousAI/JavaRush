package Test.Other;

public class Test19 {
    static void print(int... i) {
        for (int x : i) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        print();
    }
}
