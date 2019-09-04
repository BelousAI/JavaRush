package Test.Other;

public class Test20 {
    public static void main(String[] args) {
        int b = -9;
        String binaryNumber = Integer.toBinaryString(9);
        Integer num = Integer.parseInt(binaryNumber,  2);
        System.out.println(num);
        System.out.println(~b);
        System.out.println(binaryNumber);
        System.out.println(Math.round(12.34));

    }
}
