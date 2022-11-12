public class Line extends GeometricShape {
    private int length;

    public Line(int length) {
        super(length, 0);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
