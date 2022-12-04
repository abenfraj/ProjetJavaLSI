package model.shapes;

public class Circle extends GeometricShape {
    private int radius;

    public Circle(int radius) {
        super(2 * radius * (int) Math.PI, (int) Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
