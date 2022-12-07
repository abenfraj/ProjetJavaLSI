package model;

import model.frame.Drawing;
import model.frame.Image;
import model.shapes.GeometricShape;
import model.shapes.Line;
import model.shapes.Polygon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ConsoleVersion {

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Welcome !");
        System.out.println("The goal of this project is to manage different geometrical shapes through the console, using your inputs, images and drawings");
        System.out.println("An image is a collection of shapes. Remember that you can only have one type of each shape in an image.");
        System.out.println("**************************************");
        GameLauncher gameLauncher = new GameLauncher();
        gameLauncher.welcome();


//        //Création de lignes
//        Line a = new Line(149, 76, 113, 225, 113);
//        Line b = new Line(112, 225, 113, 225, 225);
//        Line c = new Line(150, 225, 225, 375, 225);
//        Line d = new Line(114, 375, 225, 76, 113);
//
//        //Ajout des lignes dans une arrayList
//        ArrayList<Line> l1 = new ArrayList<>();
//        l1.add(a);
//        l1.add(b);
//        l1.add(c);
//        l1.add(d);
//
//        //Création d'un carré
//        Polygon square = new Polygon(l1);
//        System.out.println(square.isPolygon());
//        System.out.println("************");
//        System.out.println(square);
//        System.out.println("************");
//
//        //Ajout et création du carré dans le TreeSet qui compose l'image
//        TreeSet<GeometricShape> shapes = new TreeSet<>();
//        shapes.add(square);
//        System.out.println(shapes);
//        Image i1 = new Image(shapes);
//
//        //Ajout et création de l'image dans le TreeSet du dessin
//        TreeSet<Image> images = new TreeSet<>();
//        images.add(i1);
//        Drawing drawing = new Drawing(images);
//        System.out.println(drawing);
//
//        //Création de la copie du dessin
//        Drawing copy = drawing.copy();
//        System.out.println("Copie du dessin : " + copy);
    }
}
