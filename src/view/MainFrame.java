package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private Panel jPanel;

    public MainFrame() {
        this.jPanel = new Panel();
        this.setPreferredSize(new Dimension(1500, 1000));
        this.setLocationRelativeTo(null);
        this.add(jPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void shapeSelected() {

        String[] shapeSelectedList = {"Triangle","Circle","Ellipsis","Square","Polygon","Rectangle"};
        jPanel.setLayout(null);
        this.setContentPane(jPanel);

        final JComboBox<String> combo = new JComboBox<String>(shapeSelectedList);
        combo.setBounds(10,10,200,50);

        ActionListener cbActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) combo.getSelectedItem();

                switch (s) {
                    case "Triangle":
                        System.out.println("Triangle");
                        break;
                    case "Circle":
                        System.out.println("Circle");
                        break;
                    case "Ellipsis":
                        System.out.println("Ellipsis");
                        break;
                    case "Square":
                        System.out.println("Square");
                        break;
                    case "Polygon":
                        System.out.println("Polygon");
                        break;
                    case "Rectangle":
                        System.out.println("Rectangle");
                        break;
                    default:
                        System.out.println("Nothing");
                        break;
                }
            }
        };

        combo.addActionListener(cbActionListener);
        jPanel.add(combo);
        this.pack();
        this.setVisible(true);
    }

}