package model;

import model.frame.Image;
import model.shapes.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class GameLauncher {

    private Scanner userInput = new Scanner(System.in);
    private Ellipsis ellipsis = null;
    private Circle circle = null;
    private Polygon polygon = null;
    private TreeSet<GeometricShape> shapes = new TreeSet<>();
    private Image image;

    public void welcome() {

        int choice = 0;

        System.out.println();
        System.out.println("Please select one of the options available : ");
        System.out.println("1. Draw a circle ");
        System.out.println("2. Draw an ellipsis ");
        System.out.println("3. Draw a polygon ");
        System.out.println("4. Image tab");
        System.out.println("5. Drawing tab ");
        System.out.println("6. Exit");

        choice = this.userInput.nextInt();

        switch (choice) {
            case 1:
                drawCircle();
                break;
            case 2:
                drawEllipsis();
                break;
            case 3:
                drawPolygon();
                break;
            case 4:
                imageTab();
                break;
            case 5:
                drawingTab();
                break;
            case 6:
                System.out.println("Exiting...........Done");
                break;
            default:
                welcome();
                break;
        }
    }

    private void drawingTab() {
    }

    private void imageTab() {
        int choice = 0;
        System.out.println();
        System.out.println("Here is the image tab, please select an option : ");
        System.out.println("1. Display image");
        System.out.println("2. Apply translation");
        System.out.println("3. Apply dilation");
        System.out.println("4. Apply rotation");
        System.out.println("5. Apply symmetryX");
        System.out.println("6. Apply symmetryY");
        System.out.println("7. Delete content of the image");
        System.out.println("8. Back to Welcome menu");
        choice = this.userInput.nextInt();

        switch (choice) {
            case 1:
                displayImage();
                break;
            case 2:
                applyTranslation();
                break;
            case 3:
                applyDilation();
                break;
            case 4:
                applyRotation();
                break;
            case 5:
                applySymetryX();
                break;
            case 6:
                applySymetryY();
                break;
            case 7:
                deleteContentOfImage();
                break;
            case 8:
                System.out.println("Back to Welcome menu.......");
                welcome();
                break;
            default:
                imageTab();
                break;
        }


    }

    private void deleteContentOfImage() {
        System.out.println("Removing all shapes in the image............DONE");
        for (GeometricShape shape : this.shapes) {
            this.shapes.remove(shape);
        }
        System.out.println("Back to Welcome menu.....");
        welcome();
    }

    private void applySymetryY() {
    }

    private void applySymetryX() {
    }

    private void applyRotation() {
    }

    private void applyDilation() {
    }

    private void applyTranslation() {
    }

    private void displayDrawing() {
    }

    private void displayImage() {
        if(this.shapes.isEmpty()) {
            System.out.println("The image is empty, please add shapes in it.");
            System.out.println("Back to Welcome menu....");
            welcome();
            return;
        }
        this.image = new Image(this.shapes);
        int imagePerimeter = 0;
        int imageSurface = 0;
        System.out.println("Your image has " + shapes.stream().count() + " shape(s) in it");
        for (GeometricShape shape : this.shapes) {
            imagePerimeter = shape.getPerimeter();
            imageSurface = shape.getSurface();
        }
        System.out.println("The perimeter of your image is equal to " + imagePerimeter + ", and the surface is equal to " + imageSurface);
        imageTab();
    }

    private void drawPolygon() {
        int choice = 0;

        System.out.println();

        System.out.println("Select one specific type of polygon or any type of polygon : ");
        System.out.println("1. Draw a Square ");
        System.out.println("2. Draw a Triangle ");
        System.out.println("3. Draw a Rectangle ");
        System.out.println("4. Draw any polygon ");
        System.out.println("5. Back to welcome menu");

        choice = this.userInput.nextInt();

        switch (choice) {
            case 1:
                drawSquare();
                break;
            case 2:
                drawTriangle();
                break;
            case 3:
                drawRectangle();
                break;
            case 4:
                drawAnyPolygon();
                break;
            case 5:
                System.out.println("Back to Welcome menu.......");
                welcome();
                break;
            default:
                drawPolygon();
                break;
        }

    }

    private void drawAnyPolygon() {
        int count = 0;
        System.out.println("Creating a random polygon.....");

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

        this.polygon = new Polygon(rLines);
        System.out.println("Perimeter : " + this.polygon.getPerimeter() +", Surface : " + this.polygon.getSurface());
        System.out.println("Coordinates of the polygon : ");
        for (Line rline : rLines) {
            count++;
            System.out.println("Line " + count);
            System.out.print("Xi" + count + " : " + rline.getXi() + "; ");
            System.out.print("Yi" + count + " : " + rline.getYi() + "; ");
            System.out.print("Xj" + count + " : " + rline.getXj() + "; ");
            System.out.print("Yj" + count + " : " + rline.getYj() + "; ");
            System.out.println();
        }
        this.shapes.add(this.polygon);
        welcome();
    }

    private void drawRectangle() {
        int count = 0;
        System.out.println("Please enter the rectangle's sides length : ");
        int height = this.userInput.nextInt();
        int rectLenght = this.userInput.nextInt();

        Line rect1 = new Line(rectLenght, 2, 10, 7, 10);
        Line rect2 = new Line(rectLenght, 7, 10, 7, 5);
        Line rect3 = new Line(rectLenght, 7, 5, 2, 5);
        Line rect4 = new Line(rectLenght, 2, 5, 2, 10);

        ArrayList<Line> rectLines = new ArrayList<>();
        rectLines.add(rect1);
        rectLines.add(rect2);
        rectLines.add(rect3);
        rectLines.add(rect4);

        this.polygon = new Polygon(rectLines);
        System.out.println("Perimeter : " + this.polygon.getPerimeter() +", Surface : " + this.polygon.getSurface() + ", Height : " + height);
        System.out.println("Coordinates of the rectangle : ");
        for (Line rectLine : rectLines) {
            count++;
            System.out.println("Line " + count);
            System.out.print("Xi" + count + " : " + rectLine.getXi() + "; ");
            System.out.print("Yi" + count + " : " + rectLine.getYi() + "; ");
            System.out.print("Xj" + count + " : " + rectLine.getXj() + "; ");
            System.out.print("Yj" + count + " : " + rectLine.getYj() + "; ");
            System.out.println();
        }
        this.shapes.add(this.polygon);
        welcome();
    }

    private void drawTriangle() {
        int count = 0;
        System.out.println("Please enter the trinagles's sides length : ");
        int triangleSideLenght = this.userInput.nextInt();

        Line tri1 = new Line(triangleSideLenght, 2, 10, 7, 10);
        Line tri2 = new Line(triangleSideLenght, 7, 10, 7, 5);
        Line tri3 = new Line(triangleSideLenght, 7, 5, 2, 5);

        ArrayList<Line> triLines = new ArrayList<>();
        triLines.add(tri1);
        triLines.add(tri2);
        triLines.add(tri3);

        this.polygon = new Polygon(triLines);
        System.out.println("Perimeter : " + this.polygon.getPerimeter() +", Surface : " + this.polygon.getSurface());
        System.out.println("Coordinates of the triangle : ");
        for (Line triLine : triLines) {
            count++;
            System.out.println("Line " + count);
            System.out.print("Xi" + count + " : " + triLine.getXi() + "; ");
            System.out.print("Yi" + count + " : " + triLine.getYi() + "; ");
            System.out.print("Xj" + count + " : " + triLine.getXj() + "; ");
            System.out.print("Yj" + count + " : " + triLine.getYj() + "; ");
            System.out.println();
        }
        this.shapes.add(this.polygon);
        welcome();
    }

    private void drawSquare() {
        int count = 0;
        System.out.println("Please enter the square's sides length : ");
        int length = this.userInput.nextInt();

        Line a = new Line(length, 2, 10, 7, 10);
        Line b = new Line(length, 7, 10, 7, 5);
        Line c = new Line(length, 7, 5, 2, 5);
        Line d = new Line(length, 2, 5, 2, 10);

        ArrayList<Line> lines = new ArrayList<>();
        lines.add(a);
        lines.add(b);
        lines.add(c);
        lines.add(d);

        this.polygon = new Polygon(lines);
        System.out.println("Perimeter : " + this.polygon.getPerimeter() +", Surface : " + this.polygon.getSurface());
        System.out.println("Coordinates of the square : ");
        for (Line line : lines) {
            count++;
            System.out.println("Line " + count);
            System.out.print("Xi" + count + " : " + line.getXi() + "; ");
            System.out.print("Yi" + count + " : " + line.getYi() + "; ");
            System.out.print("Xj" + count + " : " + line.getXj() + "; ");
            System.out.print("Yj" + count + " : " + line.getYj() + "; ");
            System.out.println();
        }
        this.shapes.add(this.polygon);
        welcome();
    }

    private void drawEllipsis() {
        System.out.println("Please enter the 2 radius of the ellipsis : ");
        System.out.print("First radius : ");
        int radius1 = this.userInput.nextInt();
        System.out.print("Second radius : ");
        int radius2 = this.userInput.nextInt();
        while (radius1 < 0 || radius2 < 0) {
            System.out.println("Please enter a correct value for the radius : ");
            System.out.print("First radius : ");
            radius1 = this.userInput.nextInt();
            System.out.print("Second radius : ");
            radius2 = this.userInput.nextInt();
        }
        this.ellipsis = new Ellipsis(radius1, radius2);
        this.shapes.add(this.ellipsis);
        System.out.println("Perimeter : " + this.ellipsis.getPerimeter() +", Surface : " + this.ellipsis.getSurface());
        welcome();
    }

    private void drawCircle() {
        System.out.println("Please enter the radius of the circle : ");
        System.out.print("Radius : ");
        int radius = this.userInput.nextInt();
        while (radius < 0) {
            System.out.println("Please enter a correct value for the radius : ");
            System.out.print("Radius : ");
            radius = this.userInput.nextInt();
        }
        this.circle = new Circle(radius);
        this.shapes.add(this.circle);
        System.out.println("Perimeter : " + this.circle.getPerimeter() +", Surface : " + this.circle.getSurface());
        welcome();
    }

}
