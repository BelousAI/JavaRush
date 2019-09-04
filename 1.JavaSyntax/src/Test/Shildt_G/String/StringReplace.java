package Test.Shildt_G.String;

/**
 * Created by Антон on 27.04.2017.
 */

//Замена подстроки
public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result;
        int i;

        do { //замена всех совпадающих построк
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        }
        while (i != -1);


        ///////////////////////////////////////////////////////////////////////////////////

        String s1 = "one";
        String s2 = s1.concat(" two");

        ///////////////////////////////////////////////////////////////////////////////////
        //Замена символов и подстрок!!!
        result = org.replace('t', '#');
        System.out.println("\n" + result);

        result = result.replace("was", "is");
        System.out.println(result);
    }
}
