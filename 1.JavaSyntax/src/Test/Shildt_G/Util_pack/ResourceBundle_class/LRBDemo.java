package Test.Shildt_G.Util_pack.ResourceBundle_class;

/**
 * Created by Антон on 08.06.2017.
 */
import java.util.*;

//Применение комплектов ресурсов
public class LRBDemo {
    public static void main(String[] args) {
        //Загрузить комплект ресурсов по умолчанию
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
        rd.getLocale();

        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Название: " + rd.getString("Название"));
        System.out.println("Строка по ключу Остановить: " + rd.getString("Остановить"));
        System.out.println("Строка по ключу Запустить: " + rd.getString("Запустить"));


        //Загрузка комплекта ресурсов для поддержки английского языка
        rd = ResourceBundle.getBundle("SampleRB", Locale.US);

        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Название: " + rd.getString("Название"));
        System.out.println("Строка по ключу Остановить: " + rd.getString("Остановить"));
        System.out.println("Строка по ключу Запустить: " + rd.getString("Запустить"));

        //Загрузка комплекта ресурсов для поддержки немецкого языка
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("\nНемецкая версия программы: ");
        System.out.println("Строка по ключу Название: " + rd.getString("Название"));
        System.out.println("Строка по ключу Остановить: " + rd.getString("Остановить"));
        System.out.println("Строка по ключу Запустить: " + rd.getString("Запустить"));
    }
}
