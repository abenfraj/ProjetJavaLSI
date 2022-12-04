package model;

import model.shapes.GeometricShape;
import model.shapes.Line;
import model.shapes.Polygon;

import java.util.ArrayList;
import java.util.TreeSet;

public class Lancement {
    public static void main(String[] args) {
        Line a = new Line(149, 76, 113, 225, 113);
        Line b = new Line(112, 225, 113, 225, 225);
        Line c = new Line(150, 225, 225, 375, 225);
        Line d = new Line(114, 375, 225, 375, 339);


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

        Image i1 = new model.Image(shapes);
        TreeSet<model.Image> images = new TreeSet<>();
        images.add(i1);
        Drawing drawing = new Drawing(images);
        System.out.println(drawing);

        Drawing copy = drawing.copy();
        System.out.println(copy);
    }
}
