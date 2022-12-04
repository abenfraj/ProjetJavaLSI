package view;

import model.Drawing;
import model.Image;
import model.shapes.*;
import model.shapes.Polygon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class App extends JPanel {


    private Image image;
    private Drawing drawing;
    private GeometricShape shape;


    private TreeSet<Image> images;

    public App() {


    }

    private static void createAndShowGui() {
        JFrame frame = new JFrame("Draw me a cheap");

        JSplitPane splitPane = new JSplitPane();
        JTextArea textArea;
        JToggleButton display_image;
        JToggleButton display_drawing;
        JLabel shapeInformations;
        App app;
        JPanel bottomPanel;
        TreeSet<GeometricShape> shapes = new TreeSet<>();

        JPanel inputPanel;
        textArea = new JTextArea();
        textArea.setEditable(false);
        shapeInformations = new JLabel();

        display_drawing = new JToggleButton("Display drawing");
        display_image = new JToggleButton("Display image");


        frame.setPreferredSize(new Dimension(1500, 1005));
        frame.getContentPane().setLayout(new GridLayout());
        frame.getContentPane().add(splitPane);

        String[] shapesList = new String[] {"Circle","Triangle","Ellipsis","Rectangle","Square","Polygon"};

        JComboBox<String> shapesComboBox = new JComboBox(shapesList);

        shapesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shapeSelected = shapesComboBox.getSelectedItem().toString();
                if (shapeSelected == "Triangle") {

                    Line t1 = new Line(149, 76, 113, 225, 150);
                    Line t2 = new Line(180, 225, 150, 45, 150);
                    Line t3 = new Line(149, 45, 150, 76, 113);

                    ArrayList<Line> tList = new ArrayList<>();
                    tList.add(t1);
                    tList.add(t2);
                    tList.add(t3);

                    GeometricShape triangle = new Polygon(tList);
                    shapes.add(triangle);
                }
                if (shapeSelected == "Square") {
                    Line s1 = new Line(149, 76, 113, 225, 113);
                    Line s2 = new Line(112, 225, 113, 225, 225);
                    Line s3 = new Line(150, 225, 225, 375, 225);
                    Line s4 = new Line(114, 375, 225, 375, 339);

                    ArrayList<Line> sList = new ArrayList<>();
                    sList.add(s1);
                    sList.add(s2);
                    sList.add(s3);
                    sList.add(s4);
                    GeometricShape square = new Polygon(sList);
                    shapes.add(square);
                }
                if (shapeSelected == "Rectangle") {
                    Line r1 = new Line(148, 77, 113, 225, 113);
                    Line r2 = new Line(112, 225, 113, 225, 228);
                    Line r3 = new Line(150, 225, 228, 375, 225);
                    Line r4 = new Line(114, 375, 225, 370, 339);

                    ArrayList<Line> rList = new ArrayList<>();
                    rList.add(r1);
                    rList.add(r2);
                    rList.add(r3);
                    rList.add(r4);
                    GeometricShape rectangle = new Polygon(rList);
                    shapes.add(rectangle);
                }
                if (shapeSelected == "Polygon") {
                    Line p1 = new Line(148, 77, 113, 225, 113);
                    Line p2 = new Line(112, 225, 113, 225, 228);
                    Line p3 = new Line(150, 225, 228, 375, 225);
                    Line p4 = new Line(114, 375, 225, 370, 339);

                    ArrayList<Line> pList = new ArrayList<>();
                    pList.add(p1);
                    pList.add(p2);
                    pList.add(p3);
                    pList.add(p4);
                    GeometricShape polygon = new Polygon(pList);
                    shapes.add(polygon);
                }
                if (shapeSelected == "Circle") {
                    GeometricShape circle = new Circle(5);
                    shapes.add(circle);
                }
                if (shapeSelected == "Ellipsis") {
                    GeometricShape ellipsis = new Ellipsis(10, 5);
                    shapes.add(ellipsis);
                }
            }

        });

        splitPane = new JSplitPane();
        JButton jButton = new JButton("Reset");

        bottomPanel = new JPanel();
        inputPanel = new JPanel();

        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(990);
        splitPane.setRightComponent(bottomPanel);

        bottomPanel.add(inputPanel);
        bottomPanel.add(inputPanel, BorderLayout.NORTH);

        textArea.setPreferredSize(new Dimension(440, 800));
        bottomPanel.add(textArea, BorderLayout.SOUTH);

        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 500));
        inputPanel.add(shapesComboBox, BorderLayout.NORTH);

        display_image.setPreferredSize(new Dimension(100, 20));
        bottomPanel.add(display_image, BorderLayout.NORTH);
        jButton.setPreferredSize(new Dimension(100, 20));

        display_drawing.setPreferredSize(new Dimension(100, 20));
        bottomPanel.add(display_drawing, BorderLayout.NORTH);
        jButton.setPreferredSize(new Dimension(100, 20));


        bottomPanel.add(jButton);

        bottomPanel.add(shapeInformations);

        shapesComboBox.setPreferredSize(new Dimension(220, 50));

        shapesComboBox.setMaximumSize(new Dimension(200, 500));
        bottomPanel.add(shapesComboBox);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
}