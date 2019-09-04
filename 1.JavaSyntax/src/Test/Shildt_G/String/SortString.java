package Test.Shildt_G.String;

/**
 * Created by Антон on 26.04.2017.
 */

//Пузырьковая сортировка объектов типа String
public class SortString {
    static String[] arr = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j].compareToIgnoreCase(arr[i]) > 0) {
                    String s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
            System.out.println(arr[j]);
        }
    }
}
