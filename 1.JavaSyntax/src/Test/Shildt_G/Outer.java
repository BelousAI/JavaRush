package Test.Shildt_G;

/**
 * Created by Антон on 04.04.2017.
 */
public class Outer {
    int outer_x = 100;

    void test() {
        Inner in = new Inner();
        in.display();
    }

    //Внутренний класс
    class Inner {
        int y = 10; //y - локальная переменная класса Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
        //System.out.println(y); //y - недоступна из внешнего класса
    }

    static class InnerClassDemo {
        public static void main(String[] args) {
           Outer outer = new Outer();
           outer.test();

           //Inner inner = new Inner(); //Невозможно создать объект внутреннего класса из статического контекста
        }
    }
}
