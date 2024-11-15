package Graphic;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Hangman_Drawing_Canvas implements Drawing {


    @Override
    public void drawHangman(Graphics2D graphics2D, int x, int h, int value) {

        graphics2D.fillRect(x / 2 - 50, h / 2 + 130, 100, 10);
        Path2D.Double a = new Path2D.Double();
        a.moveTo((double) (x / 2), (double) (h / 2) + 130);
        a.lineTo((double) (x / 2), 150);
        a.lineTo((double) (x / 2) + 100, 150);
        a.lineTo((double) (x / 2), 200);
        graphics2D.draw(a);
        Path2D.Double b = new Path2D.Double();
        b.moveTo((double) (x / 2) + 100, 150);
        b.lineTo((double) (x / 2) + 100, 200);
        graphics2D.draw(b);
        if (value < 8) {
            graphics2D.drawOval((x / 2) + 75, 200, 50, 50);
        }
        if (value < 5) {


            Path2D.Double c = new Path2D.Double();
            b.moveTo((double) (x / 2) + 100, 200);
            b.lineTo((double) (x / 2) + 100, 250);


        }
    }

}

