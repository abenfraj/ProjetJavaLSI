public class Line extends GeometricShape {
    private int length;
    private int xi;
    private int yi;
    private int xj;
    private int yj;

    public Line(int length, int xi, int yi, int xj, int yj) {
        super();
        this.length = length;
        this.xi = xi;
        this.yi = yi;
        this.xj = xj;
        this.yj = yj;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }

    public int getXj() {
        return xj;
    }

    public void setXj(int xj) {
        this.xj = xj;
    }

    public int getYj() {
        return yj;
    }

    public void setYj(int yj) {
        this.yj = yj;
    }
}

