package Window;





import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Flow;

public class ApplikationWindow  implements  ActionListener{




    //Jframe
    private JFrame jFrame;

    //Layout
    private GridLayout gridLayout;

    //Jpanel
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    //JButton
    private JButton jButton1;
    private JButton jButton2;


    //Textfield
    private JFormattedTextField f1;
    private JTextArea f2;

    //other variables
    Set<Character> listOfCharacters;
    private String options;
    private int numberOfPlayers;

    //Klasse
    private GameWindow paintGame;




    public ApplikationWindow(){
        setUpInit();

    }


    private void setUpInit(){

        paintGame = new GameWindow();
        setSelectionAndVariables();

        jFrame = new JFrame("My Hangman");
        jFrame.setSize(800,800);
        if(numberOfPlayers == 1){
            paintGame.setCurrentAttempts(10);
            jFrame.add(mainPanel());

        }else{

        }
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }


    //Display
    private JPanel mainPanel(){
        panel3 = new JPanel(new BorderLayout());

        gridLayout = new GridLayout(4,1);
        panel1 = new JPanel(gridLayout);


        f1 = new JFormattedTextField();
        f1.setColumns(20);

        f2 = new JTextArea();


        jButton1 = new JButton("New Game");
        jButton2 = new JButton("Exit");

        panel1.add(f1);
        panel1.add(f2);
        panel1.add(jButton1);
        panel1.add(jButton2);


        panel3.add(paintGame);
        panel3.add(panel1, BorderLayout.EAST);


        return panel3;
    }




    private void setSelectionAndVariables(){
        JOptionPane.showMessageDialog(null, "Welcome to Hangman");

        options = JOptionPane.showInputDialog(null, "Choose between: \n 1. 1 -Player\n 2. 2 - Players\n 3. Exit");
        try {
            numberOfPlayers = Integer.parseInt(options);
            if (numberOfPlayers == 3) {
                System.exit(0);
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "next time input a valid number");
            System.exit(0);
        }

        options = JOptionPane.showInputDialog(null,"Pick the Topic: \n 1. Plants \n 2. Names \n 3. Games \n 4. Placeholder...");
        try {
            int numberOfTopic = Integer.parseInt(options);
            //paintGame.setNumberOfFigure();
            if (numberOfTopic == 4) {
                System.exit(0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "next time input a valid number");
            System.exit(0);
        }


        options = JOptionPane.showInputDialog(null,"What figue to display ? \n 1. Original Hangman \n 2. A Tree \n 3. The Sun");
        int numberOfFigure = Integer.parseInt(options);
        paintGame.setNumberOfFigure(numberOfFigure);

    }



    //Resett evry.
    private void newGame(){


    }



    @Override
    public void actionPerformed(ActionEvent e) {



    }




}



