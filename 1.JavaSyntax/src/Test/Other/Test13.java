package Test.Other;

/**
 * Created by Антон on 12.04.2017.
 */
public class Test13 {
    public static void main(String[] args) {

        int count = 100;
        StringBuffer output = new StringBuffer(110);
        output.append("Some text");
        for(int i =0; i<count; i++) {
            output.append(i);
        }
        System.out.println(output.toString());
    }
}
