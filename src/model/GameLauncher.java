package model;

import model.frame.Drawing;
import model.frame.Image;
import model.shapes.*;
import model.transformations.DrawingTransformation;
import model.transformations.ImageTransformation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class GameLauncher {

    private Scanner userInput = new Scanner(System.in);

    private Ellipsis ellipsis = null;
    private Circle circle = null;
    private Polygon polygon = null;

    private TreeSet<GeometricShape> shapes = new TreeSet<>();
    private Image image = new Image(this.shapes);

    private TreeSet<Image> images = new TreeSet<>();
    private Drawing drawing = new Drawing(this.images);

    private ImageTransformation imageTransformation = new ImageTransformation(this.shapes);
    private DrawingTransformation drawingTransformation = new DrawingTransformation(this.images);

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
                drawPolygonMenu();
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

    //Section used to draw different shapes
    private void drawPolygonMenu() {
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
                drawPolygonMenu();
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

    //Section used to manage the images
    private void imageTab() {
        int choice = 0;

        if(!this.shapes.isEmpty()) {
            this.images.add(this.image);
        }

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
                applyTranslationOnImage();
                break;
            case 3:
                applyDilationOnImage();
                break;
            case 4:
                applyRotationOnImage();
                break;
            case 5:
                applySymetryXOnImage();
                break;
            case 6:
                applySymetryYOnImage();
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

    private void displayImage() {
        int count = 0;

        if(this.shapes.isEmpty()) {
            System.out.println("The image is empty, please add shapes in it.");
            System.out.println("Back to Welcome menu....");
            welcome();
            return;
        }

        int imagePerimeter = 0;
        int imageSurface = 0;
        System.out.println("Your image has " + shapes.stream().count() + " shape(s) in it");
        for (GeometricShape shape : this.shapes) {
            if(shape instanceof Polygon) {
                for (Line line : ((Polygon) shape).getLines()) {
                    count++;
                    System.out.println("Coordinates of line " + count);
                    System.out.print("Xi" + count + " : " + line.getXi() + "; ");
                    System.out.print("Yi" + count + " : " + line.getYi() + "; ");
                    System.out.print("Xj" + count + " : " + line.getXj() + "; ");
                    System.out.print("Yj" + count + " : " + line.getYj() + "; ");
                    System.out.println();
                }
            }
            if(shape instanceof Circle) {
                System.out.println("Radius of the circle : " + ((Circle) shape).getRadius());
            }
            if(shape instanceof Ellipsis) {
                System.out.println("First Radius of the ellipsis : " + ((Ellipsis) shape).getRadius1());
                System.out.println("Second Radius of the ellipsis : " + ((Ellipsis) shape).getRadius2());
            }
            imagePerimeter += shape.getPerimeter();
            imageSurface += shape.getSurface();
        }
        System.out.println("The perimeter of your image is equal to " + imagePerimeter + ", and it surface is equal to " + imageSurface);
        imageTab();
    }

    private void deleteContentOfImage() {
        System.out.println("Removing all shapes in the image............DONE");
        this.shapes.removeAll(shapes);


        System.out.println("Back to Welcome menu.....");
        welcome();
    }

    private void applySymetryYOnImage() {
        this.imageTransformation.symmetryY();
        System.out.println("Applying the rotation using the vertical axis of the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the image.");
        imageTab();
    }

    private void applySymetryXOnImage() {
        this.imageTransformation.symmetryX();
        System.out.println("Applying the rotation using the horizontal axis of the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the image.");
        imageTab();
    }

    private void applyRotationOnImage() {
        this.imageTransformation.rotation();
        System.out.println("Applying the rotation to the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the image.");
        imageTab();
    }

    private void applyDilationOnImage() {
        System.out.print("Please enter the value you want to apply to all the geometric shapes for the dilation : ");
        int imageDilationValue = this.userInput.nextInt();
        while(imageDilationValue < 0) {
            System.out.print("Please enter a positive value : ");
            imageDilationValue = this.userInput.nextInt();
        }
        System.out.println("Dilation of " + imageDilationValue + " .........DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the image.");
        imageTab();
    }

    private void applyTranslationOnImage() {
        System.out.print("Please enter the value you want to apply to all the geometric shape for the translation : ");
        int imageTranslationValue = this.userInput.nextInt();
        imageTransformation.translation(imageTranslationValue);
        System.out.println("Translation of " + imageTranslationValue + " ............DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the image.");
        imageTab();
    }

    //Section used to manage the drawing
    private void drawingTab() {
        int choice = 0;
        System.out.println();
        System.out.println("Reminder : if you want to remove the content of a drawing, you need to remove the shapes first...");
        System.out.println("Here is the drawing tab, please select an option : ");
        System.out.println("1. Display drawing");
        System.out.println("2. Apply translation");
        System.out.println("3. Apply dilation");
        System.out.println("4. Apply rotation");
        System.out.println("5. Apply symmetryX");
        System.out.println("6. Apply symmetryY");
        System.out.println("7. Delete content of the drawing");
        System.out.println("8. Back to Welcome menu");
        choice = this.userInput.nextInt();

        switch (choice) {
            case 1:
                displayDrawing();
                break;
            case 2:
                applyTranslationOnDrawing();
                break;
            case 3:
                applyDilationOnDrawing();
                break;
            case 4:
                applyRotationOnDrawing();
                break;
            case 5:
                applySymetryXOnDrawing();
                break;
            case 6:
                applySymetryYOnDrawing();
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

    private void displayDrawing() {
        int count = 0;

        if(this.shapes.isEmpty()) {
            System.out.println("The drawing is empty, please add images in it.");
            System.out.println("Back to Welcome menu....");
            for(Image image : this.images) {
                this.images.remove(image);
            }
            welcome();
            return;
        }
        int drawingPerimeter = 0;
        int drawingSurface = 0;
        System.out.println("Your drawing has " + this.images.stream().count() + " image(s) in it");
        for (Image image : this.images) {
            for (GeometricShape geometricShape : image.getShapes()) {
                if(geometricShape instanceof Polygon) {
                    for (Line line : ((Polygon) geometricShape).getLines()) {
                        count++;
                        System.out.println("Coordinates of line " + count);
                        System.out.print("Xi" + count + " : " + line.getXi() + "; ");
                        System.out.print("Yi" + count + " : " + line.getYi() + "; ");
                        System.out.print("Xj" + count + " : " + line.getXj() + "; ");
                        System.out.print("Yj" + count + " : " + line.getYj() + "; ");
                        System.out.println();
                    }
                }
                if(geometricShape instanceof Circle) {
                    System.out.println("Radius of the circle : " + ((Circle) geometricShape).getRadius());
                }
                if(geometricShape instanceof Ellipsis) {
                    System.out.println("First Radius of the ellipsis : " + ((Ellipsis) geometricShape).getRadius1());
                    System.out.println("Second Radius of the ellipsis : " + ((Ellipsis) geometricShape).getRadius2());
                }

                drawingPerimeter += geometricShape.getPerimeter();
                drawingSurface += geometricShape.getSurface();

            }
        }
        System.out.println("The perimeter of your drawing is equal to " + drawingPerimeter + ", and it surface is equal to " + drawingSurface);
        drawingTab();
    }

    private void applySymetryXOnDrawing() {
        this.drawingTransformation.symmetryX();
        System.out.println("Applying the rotation using the vertical axis of the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the drawing.");
        drawingTab();
    }

    private void applySymetryYOnDrawing() {
        this.drawingTransformation.symmetryY();
        System.out.println("Applying the rotation using the horizontal axis of the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the drawing.");
        drawingTab();
    }

    private void applyRotationOnDrawing() {
        this.drawingTransformation.rotation();
        System.out.println("Applying the rotation to the geometric shapes................DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the drawing.");
        drawingTab();
    }

    private void applyDilationOnDrawing() {
        System.out.print("Please enter the value you want to apply to all the geometric shapes for the dilation : ");
        int drawingDilationValue = this.userInput.nextInt();
        while(drawingDilationValue < 0) {
            System.out.print("Please enter a positive value : ");
            drawingDilationValue = this.userInput.nextInt();
        }
        System.out.println("Dilation of " + drawingDilationValue + " .........DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the drawing.");
        drawingTab();
    }

    private void applyTranslationOnDrawing() {
        System.out.print("Please enter the value you want to apply to all the geometric shape for the translation : ");
        int drawingTranslationValue = this.userInput.nextInt();
        imageTransformation.translation(drawingTranslationValue);
        System.out.println("Translation of " + drawingTranslationValue + " ............DONE");
        System.out.println("The coordinates of the shapes has been successfully changed. To check the new values, display the drawing.");
        drawingTab();
    }
}
