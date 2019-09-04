package Test.Other;
import java.io.*;
/**
 * Created by Антон on 08.05.2017.
 */
public class Test5 {
    public static void main(String[] args) throws IOException {

        //Кладем даннык в строку
        StringBuilder sb = new StringBuilder();
        sb.append("Vika").append('\n');
        sb.append("Olga").append('\n');
        sb.append("Vera").append('\n');
        String data = sb.toString();

        //Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //Подменяем in
        System.setIn(is);

        //вызов обычного метода
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
    }
}
