package Test.Shildt_G.Stack_Interface;

/**
 * Created by Антон on 07.04.2017.
 */
public interface IntStack {
    void push(int item);  //Сохранить элемент в стеке
    int pop();            //Извлечь элемент из стека

    default void clear() throws UnsupportedOperationException {
        System.out.println("Метод clear() не реализован");
        throw new UnsupportedOperationException();
    }
}
