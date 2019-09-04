package Test.Shildt_G.IO.Podrobno.Only;

import java.io.*;

/**
 * Created by Антон on 12.06.2017.
 */
public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
