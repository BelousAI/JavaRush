package Test.Shildt_G.Lambda.Example_Block1;


//Реализация Inner класса
public class Test {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };
        run.run();
    }
}
