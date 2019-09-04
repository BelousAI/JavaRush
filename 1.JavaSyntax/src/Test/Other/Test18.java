package Test.Other;

public class Test18 {
    private int[] arr = new int[5];
    private int capacity = arr.length;
    private int size = 0;

    public static void main(String[] args) {
        Test18 obj = new Test18();

        try {
            obj.push(1);
            obj.push(2);
            obj.push(3);
            obj.push(4);
            obj.push(5);
            //obj.push(6);

            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            //obj.pop();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Стек давно уже пуст!");
        }
    }

    public void push(int n) {
        if (size < capacity) {
            arr[size] = n;
            size++;
        }
        else {
            System.out.println("Стек переполнен!!");
        }
    }

    public int pop() {
        if (size >= 0) {
            size--;
        }
        return arr[size];
    }
}
