package Test.Shildt_G.Util_pack.ResourceBundle_class;

/**
 * Created by Антон on 08.06.2017.
 */
import java.util.*;

public class SampleRB_en extends ListResourceBundle {
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "Название";
        resources[0][1] = "My Program";

        resources[1][0] = "Остановить";
        resources[1][1] = "Stop";

        resources[2][0] = "Запустить";
        resources[2][1] = "Start";

        return resources;
    }
}
