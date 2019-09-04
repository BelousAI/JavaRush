package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Антон on 21.03.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes o) {
        if (o == ImageTypes.BMP) {
            return new BmpReader();
        }
        else if (o == ImageTypes.JPG) {
            return new JpgReader();
        }
        else if (o == ImageTypes.PNG) {
            return new PngReader();
        }
        else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
