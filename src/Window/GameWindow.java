package Window;

import Graphic.Drawing;
import Graphic.Hangman_Drawing_Canvas;
import Graphic.Sun_Drawing_Canvas;
import Graphic.Tree_Drawing_Canvas;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GameWindow extends JPanel implements PropertyChangeListener{

    private final Drawing drawHangman = new Hangman_Drawing_Canvas();
    private final Drawing drawSun = new Sun_Drawing_Canvas();
    private final Drawing drawTree = new Tree_Drawing_Canvas();


    private int numberOfFigure;
    private int numberOfTopic;
    private int currentAttempts;
    //simple Antialising
    private final RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    /**
     * Consturctor
     */
    public GameWindow(){

    }

    /**
     *Setters
     */
    public void setNumberOfFigure(int numberOfFigure) {
        this.numberOfFigure = numberOfFigure;
    }

    public void setCurrentAttempts(int currentAttempts) {
        this.currentAttempts = currentAttempts;
    }

    public int getCurrentAttempts() {
        return currentAttempts;
    }

    /**
     * paint the Hangman
     * calling class Hangman_Drawing_Canvas for Drawing the standard image
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics graphics){

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHints(rh);
        g2d.setColor(Color.BLACK);

        switch(numberOfFigure){

            case 1: drawHangman.drawHangman(g2d,this.getWidth(),this.getHeight()/2,getCurrentAttempts());
                break;

                    //placeholder
            case 2: drawSun.drawHangman(g2d,this.getWidth(),this.getHeight()/2,getCurrentAttempts());

            case 3: drawTree.drawHangman(g2d,this.getWidth(),this.getHeight()/2,getCurrentAttempts());
                break;

            default:
                System.out.println("NaN");
                break;
        }

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if("currentAttempts".equals(evt.getPropertyName())){
            int currentValue = (int) evt.getNewValue();
            setCurrentAttempts(currentValue);
            repaint();
        }
    }
}
