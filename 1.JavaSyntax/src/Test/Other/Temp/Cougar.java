package Test.Other.Temp;

public class Cougar extends Feline {
    public Cougar() {
        System.out.println("cougar");
    }

    public void go() {
        type = "c";
        System.out.println(this.type + super.type);
    }

    public static void main(String[] args) {
        new Cougar().go();
    }
}
