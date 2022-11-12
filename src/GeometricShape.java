public abstract class GeometricShape {
    private int perimeter;
    private int surface;

    public GeometricShape(int perimeter, int surface) {
        this.perimeter = perimeter;
        this.surface = surface;
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
}
