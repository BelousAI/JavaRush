package Test.Shildt_G.Stack_Interface;


/**
 * Created by Антон on 31.03.2017.
 */
public class Stack implements IntStack {
    private int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1; //Инициализация вершины стека
    }

    //Положить в стек новый элемент
    public void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        }
        else stck[++tos] = item;
    }

    //Извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }

    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //разместить числа в стеке
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        //Извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 10; i > 0; i--) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Содержимое стека myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

        myStack1.clear();
    }
}
