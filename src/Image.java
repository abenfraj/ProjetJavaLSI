import java.util.ArrayList;

public class Image {
    private ArrayList<GeometricShape> shapes;
    private int perimeter;
    private int surface;

    public Image(ArrayList<GeometricShape> shapes) {
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
}
