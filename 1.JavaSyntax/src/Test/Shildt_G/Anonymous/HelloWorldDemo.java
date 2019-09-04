package Test.Shildt_G.Anonymous;

/**
 * Created by Антон on 20.06.2017.
 */
public class HelloWorldDemo {
    public static void main(String[] args) {
        HelloWorld x = new HelloWorld() {
            private String someone;

            @Override
            public void greet() {
                System.out.println("Hello!");
            }

            @Override
            public void greetSomeone(String someone) {
                this.someone = someone;
                System.out.println("Hello! " + someone);
            }
        };
    }
}
