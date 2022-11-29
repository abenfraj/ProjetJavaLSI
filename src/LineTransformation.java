public class LineTransformation implements Transformation{
    private Line line;

    @Override
    public void translation(int value) {
        this.line.setXi(this.line.getXi() + value);
        this.line.setYi(this.line.getYi() + value);
        this.line.setXj(this.line.getXj() + value);
        this.line.setYj(this.line.getYj() + value);
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            this.line.setXi(this.line.getXi() * factor);
            this.line.setYi(this.line.getYi() * factor);
            this.line.setXj(this.line.getXj() * factor);
            this.line.setYj(this.line.getYj() * factor);
        }
    }

    @Override
    public void rotation() {
        int xi = this.line.getXi();
        int yi = this.line.getYi();
        int xj = this.line.getXj();
        int yj = this.line.getYj();
        this.line.setXi(yi);
        this.line.setYi(xi);
        this.line.setXj(yj);
        this.line.setYj(xj);
    }

    @Override
    public void symmetryX() {
        this.line.setXi(this.line.getXi() * -1);
        this.line.setXj(this.line.getXj() * -1);
    }

    @Override
    public void symmetryY() {
        this.line.setYi(this.line.getYi() * -1);
        this.line.setYj(this.line.getYj() * -1);
    }
}
