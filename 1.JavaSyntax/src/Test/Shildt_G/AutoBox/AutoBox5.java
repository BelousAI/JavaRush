package Test.Shildt_G.AutoBox;

/**
 * Created by Антон on 11.04.2017.
 */
public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true; //автоупаковка типа boolean

        //Объект b автоматически распаковывается,
        //когда он употребляется в условном операторе if
        if (b) System.out.println("b равно true");

        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 равно: " + ch2);
    }
}
