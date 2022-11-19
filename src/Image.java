import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Image {
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
}
