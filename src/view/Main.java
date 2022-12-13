package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.shapeSelected();
                mainFrame.setLocationRelativeTo(null);
            }
        });
    }
}
