package model.shapes;

public class Ellipsis extends GeometricShape {
    private int radius1;
    private int radius2;

    public Ellipsis(int radius1, int radius2) {
        super(
                (int) (2 * Math.PI * Math.sqrt((radius1 * radius1 + radius2 * radius2) / 2)),
                (int) (Math.PI * radius1 * radius2)
        );
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public String toString() {
        return "Ellipsis{" +
                "radius1=" + radius1 +
                ", radius2=" + radius2 +
                '}';
    }
}
