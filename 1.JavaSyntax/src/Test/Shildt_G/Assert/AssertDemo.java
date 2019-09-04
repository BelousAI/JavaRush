
package Test.Shildt_G.Assert;

//Применение утверждений
public class AssertDemo {
    static int val = 3;

    //Возвратить целочисленное значение
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++) {
            //n = getnum();

            assert (n = getnum()) > 0; //не подтвердится, если n == 0

            System.out.println("n равно " + n);
        }
    }
}
