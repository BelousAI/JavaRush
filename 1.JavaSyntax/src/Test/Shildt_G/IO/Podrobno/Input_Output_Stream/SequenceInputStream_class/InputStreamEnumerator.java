package Test.Shildt_G.IO.Podrobno.Input_Output_Stream.SequenceInputStream_class;

import java.io.*;
import java.util.*;

/**
 * Created by Антон on 13.06.2017.
 */
public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        }
        catch(FileNotFoundException e) {
            return null;
        }
    }
}
