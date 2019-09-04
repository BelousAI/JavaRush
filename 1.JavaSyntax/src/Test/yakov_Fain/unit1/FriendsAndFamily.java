package Test.yakov_Fain.unit1;

import java.util.Locale;
import java.util.Scanner;

public class FriendsAndFamily {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //дает возможность использовать (.) вместо (,)
        input.useLocale(Locale.US);

        do {
            System.out.println("\nEnter list price: ");
            double listPrice = input.nextDouble();

            System.out.println("Enter discount %: ");
            int discount = input.nextInt();

            System.out.println("You`ll price: " + listPrice * (1 - (double)discount/100) + "$");
        }
        while (true);
    }
}
