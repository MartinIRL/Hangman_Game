package Window;

import javax.swing.*;

public class ApplikationMain {


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ApplikationWindow();
            }

        });

    }

}
