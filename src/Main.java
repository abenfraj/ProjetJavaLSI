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

        Line a = new Line(10,0,1);
        Line b = new Line(10,1,-1);
        Line c = new Line(10,-1,-1);
        Line d = new Line(10,-1,0);

        Line e = new Line(20,8,1);
        Line f = new Line(20,1,-1);
        Line g = new Line(20,-1,-1);
        Line h = new Line(20,-1,8);

        ArrayList<Line> l1 = new ArrayList<>();
        l1.add(a);
        l1.add(b);
        l1.add(c);
        l1.add(d);

        ArrayList<Line> l2 = new ArrayList<>();
        l2.add(e);
        l2.add(f);
        l2.add(g);
        l2.add(h);

        Polygon square2 = new Polygon(l2);
        Polygon square = new Polygon(l1);
        System.out.println(square.isPolygon());
        System.out.println(square2.isPolygon());

        TreeSet<GeometricShape> shapes = new TreeSet<>();
        shapes.add(square);
        shapes.add(square2);
        System.out.println(shapes);

        Image i1 = new Image(shapes);
        TreeSet<Image> images = new TreeSet<>();
        images.add(i1);
        Drawing drawing = new Drawing(images);
        System.out.println(drawing);

        Drawing copie = drawing.copy();
        System.out.println(copie);


    }
}