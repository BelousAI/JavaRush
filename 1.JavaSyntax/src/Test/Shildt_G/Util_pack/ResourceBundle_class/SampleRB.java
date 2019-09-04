package Test.Shildt_G.Util_pack.ResourceBundle_class;

import java.util.ListResourceBundle;

/**
 * Created by Антон on 08.06.2017.
 */
public class SampleRB extends ListResourceBundle {
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "Название";
        resources[0][1] = "Моя программа";

        resources[1][0] = "Остановить";
        resources[1][1] = "Стоп";

        resources[2][0] = "Запустить";
        resources[2][1] = "Старт";

        return resources;
    }
}
