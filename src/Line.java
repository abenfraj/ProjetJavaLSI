public class Line extends GeometricShape {
    private int length;
    private int x;
    private int y;

    public Line(int length, int x, int y) {
        super();
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

