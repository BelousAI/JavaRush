

import java.applet.*;
import java.awt.*;

/*
<applet code="SimpleApplet.class" width=200 height=60>
</applet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("A Simple Applet", 20, 20);
    }
}
