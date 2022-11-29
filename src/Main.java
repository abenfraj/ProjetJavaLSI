import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Et hop!");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JDialog jd = new JDialog(jf,"Un dialogue");
        jd.setVisible(true);

        Line a = new Line(149,76,113, 225, 113);
        Line b = new Line(112,225, 113, 225, 225);
        Line c = new Line(150,225, 225, 375, 225);
        Line d = new Line(114,375, 225, 375, 339);
        Line e = new Line(299,375, 339, 76, 339);
        Line f = new Line(226,76, 339, 76, 113);


        ArrayList<Line> l1 = new ArrayList<>();
        l1.add(a);
        l1.add(b);
        l1.add(c);
        l1.add(d);

        Polygon square = new Polygon(l1);
        System.out.println(square.isPolygon());
        System.out.println("************");
        System.out.println(square);
        System.out.println("************");

        TreeSet<GeometricShape> shapes = new TreeSet<>();
        shapes.add(square);
        System.out.println(shapes);

        Image i1 = new Image(shapes);
        TreeSet<Image> images = new TreeSet<>();
        images.add(i1);
        Drawing drawing = new Drawing(images);
        System.out.println(drawing);

        Drawing copy = drawing.copy();
        System.out.println(copy);


    }
}