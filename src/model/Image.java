package model;

import model.shapes.GeometricShape;

import java.util.TreeSet;

public class Image implements Comparable<Image>{
    private TreeSet<GeometricShape> shapes;
    private int perimeter;
    private int surface;

    public Image(TreeSet<GeometricShape> shapes) {
        this.shapes = shapes;
        this.setPerimeter();
        this.setSurface();
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getSurface() {
        return surface;
    }

    public void setPerimeter() {
        int perimeter = 0;
        for (GeometricShape shape : shapes) {
            perimeter += shape.getPerimeter();
        }
        this.perimeter = perimeter;
    }

    public void setSurface() {
        int surface = 0;
        for (GeometricShape shape : shapes) {
            surface += shape.getSurface();
        }
        this.surface = surface;
    }

    @Override
    public int compareTo(Image o) {
        if(this.getSurface() > o.getSurface()) {
            return 1;
        } else if(this.getSurface() < o.getSurface()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "model.Image{" +
                "shapes=" + shapes;
    }
}
