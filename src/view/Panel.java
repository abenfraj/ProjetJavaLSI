package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        this.setPreferredSize(new Dimension(1500,1000));
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        JComboBox jComboBox = (JComboBox) this.getComponent(0);
        Graphics2D g2D = (Graphics2D) g;


        if(jComboBox.getSelectedItem().equals("Rectangle")) {
            g2D.drawRect(100,200,100,200);
        }

    }
}
