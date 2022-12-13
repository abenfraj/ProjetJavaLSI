package view;

import model.shapes.*;
import model.shapes.Polygon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TreeSet;

public class MainFrame extends JFrame{

    private Panel jPanel;


    public MainFrame() {
        this.jPanel = new Panel();
        this.setPreferredSize(new Dimension(1000, 700));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void shapeSelected() {

        String[] shapeSelectedList = {" Choisir une forme","Triangle","Circle","Ellipsis","Square","Polygon","Rectangle"};
        TreeSet<GeometricShape> geometricShapes = new TreeSet<>();
        this.setContentPane(jPanel);



        ActionListener cbActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) jPanel.getCombo().getSelectedItem();

                switch (s) {
                    case " ":
                        System.out.println("init.....");
                        break;
                    case "Triangle":
                        System.out.println("Triangle");
                        Line tri1 = new Line(5, 2, 10, 7, 10);
                        Line tri2 = new Line(5, 7, 10, 7, 5);
                        Line tri3 = new Line(5, 7, 5, 2, 5);

                        ArrayList<Line> triLines = new ArrayList<>();
                        triLines.add(tri1);
                        triLines.add(tri2);
                        triLines.add(tri3);
                        Polygon triangle = new Polygon(triLines);
                        geometricShapes.add(triangle);

                        break;
                    case "Circle":
                        System.out.println("Circle");
                        Circle circle = new Circle(10);
                        geometricShapes.add(circle);
                        break;
                    case "Ellipsis":
                        System.out.println("Ellipsis");
                        Ellipsis ellipsis = new Ellipsis(10, 10);
                        geometricShapes.add(ellipsis);
                        break;
                    case "Square":
                        System.out.println("Square");
                        Line a = new Line(10, 2, 10, 7, 10);
                        Line b = new Line(10, 7, 10, 7, 5);
                        Line c = new Line(10, 7, 5, 2, 5);
                        Line d = new Line(10, 2, 5, 2, 10);

                        ArrayList<Line> lines = new ArrayList<>();
                        lines.add(a);
                        lines.add(b);
                        lines.add(c);
                        lines.add(d);

                        Polygon square = new Polygon(lines);
                        geometricShapes.add(square);
                        break;
                    case "Polygon":
                        System.out.println("Polygon");

                        Line r1 = new Line((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                        Line r2 = new Line((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                        Line r3 = new Line((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                        Line r4 = new Line((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                        Line r5 = new Line((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 10);

                        ArrayList<Line> rLines = new ArrayList<>();
                        rLines.add(r1);
                        rLines.add(r2);
                        rLines.add(r3);
                        rLines.add(r4);
                        rLines.add(r5);

                        Polygon random = new Polygon(rLines);
                        geometricShapes.add(random);

                        break;
                    case "Rectangle":
                        System.out.println("Rectangle");

                        Line rect1 = new Line(10, 2, 10, 7, 10);
                        Line rect2 = new Line(10, 7, 10, 7, 5);
                        Line rect3 = new Line(10, 7, 5, 2, 5);
                        Line rect4 = new Line(10, 2, 5, 2, 10);

                        ArrayList<Line> rectLines = new ArrayList<>();
                        rectLines.add(rect1);
                        rectLines.add(rect2);
                        rectLines.add(rect3);
                        rectLines.add(rect4);

                        Polygon rectangle = new Polygon(rectLines);
                        geometricShapes.add(rectangle);

                        break;
                    default:
                        System.out.println("Nothing");
                        break;
                }
                jPanel.updateUI();
            }
        };

        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("************** Voici votre image actuelle :  *****************");
                for (GeometricShape geometricShape : geometricShapes) {
                    if(geometricShape instanceof Ellipsis) {
                        System.out.println((Ellipsis) geometricShape);
                    }
                    else {
                        System.out.println(geometricShape);
                    }
                }
            }
        };

        jPanel.getjButton().addActionListener(buttonActionListener);
        jPanel.getCombo().addActionListener(cbActionListener);
        this.pack();
        this.setVisible(true);
    }

}