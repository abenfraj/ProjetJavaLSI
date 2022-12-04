package model.shapes;

public abstract class GeometricShape implements Comparable<GeometricShape> {
    private int perimeter;
    private int surface;

    public GeometricShape(int perimeter, int surface) {
        this.perimeter = perimeter;
        this.surface = surface;
    }

    public GeometricShape() {

    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getSurface() {
        return surface;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    @Override
    public int compareTo(GeometricShape o) {
        if(this.getPerimeter() > o.getPerimeter()) {
            return 1;
        } else if(this.getPerimeter() < o.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "model.shapes.GeometricShape [perimeter=" + perimeter + ", surface=" + surface + "]";
    }
}
