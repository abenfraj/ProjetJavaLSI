package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    String[] shapeSelectedList = {" Choisir une forme","Triangle","Circle","Ellipsis","Square","Polygon","Rectangle"};
    JComboBox<String> combo = new JComboBox<String>(shapeSelectedList);
    JButton jButton = new JButton("Afficher image");


    public Panel() {
        add(jButton);
        jButton.setBounds(700,700,200,50);
        add(combo);
        combo.setSelectedIndex(0);
        combo.setBounds(10,10,200,50);
        this.setPreferredSize(new Dimension(1000,700));
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        JComboBox jComboBox = (JComboBox) this.getComponent(1);
        Graphics2D g2D = (Graphics2D) g;

        if(jComboBox.getSelectedItem().equals("Square")) {
            g2D.drawRect(300,300,100,100);
        }

        if(jComboBox.getSelectedItem().equals("Rectangle")) {
            g2D.drawRect(100,200,100,200);
        }

        if(jComboBox.getSelectedItem().equals("Triangle")) {
            int[] xPoints = {150,250,300};
            int[] yPoints = {300,150,300};
            g2D.drawPolygon(xPoints,yPoints,3);
        }

        if(jComboBox.getSelectedItem().equals("Circle")) {
            g2D.drawOval(500,500,100,100);
        }

        if(jComboBox.getSelectedItem().equals("Ellipsis")) {
            g2D.drawArc(600,600,100,50,0,180);
            g2D.drawArc(600,600,100,50,180,360);
        }

        if(jComboBox.getSelectedItem().equals("Polygon")) {
            g2D.drawLine(450,450,400,300);
            g2D.drawLine(400,300,350,375);
            g2D.drawLine(350,375,385,50);
            g2D.drawLine(385,50,450,450);
        }

    }

    public JComboBox<String> getCombo() {
        return combo;
    }

    public void setCombo(JComboBox<String> combo) {
        this.combo = combo;
    }

    public JButton getjButton() {
        return jButton;
    }

    public void setjButton(JButton jButton) {
        this.jButton = jButton;
    }
}