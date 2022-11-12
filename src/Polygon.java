import java.util.ArrayList;

public class Polygon extends GeometricShape {
    private ArrayList<Line> lines;

    public Polygon(ArrayList<Line> lines) {
        super(0, 0);
        this.lines = lines;
        this.setPerimeter();
        this.setSurface();
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public void setPerimeter() {
        int perimeter = 0;
        for (Line line : lines) {
            perimeter += line.getLength();
        }
        this.setPerimeter(perimeter);
    }

    public void setSurface() {
        int surface = 0;
        for (Line line : lines) {
            surface += line.getLength();
        }
        this.setSurface(surface);
    }
}
