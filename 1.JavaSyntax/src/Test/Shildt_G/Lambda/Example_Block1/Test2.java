package Test.Shildt_G.Lambda.Example_Block1;


//Реалиция с помощью Лямбд
public class Test2 {
    public static void main(String[] args) {
        Runnable doSomething = () -> System.out.println("Hello!");
        doSomething.run();
    }
}
