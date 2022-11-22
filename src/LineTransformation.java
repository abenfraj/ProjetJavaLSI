public class LineTransformation implements Transformation{
    private Line line;

    @Override
    public void translation(int value) {
        this.line.setX(this.line.getX() + value);
        this.line.setY(this.line.getY() + value);
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            this.line.setX(this.line.getX() * factor);
            this.line.setY(this.line.getY() * factor);
        }
    }

    @Override
    public void rotation() {
        int x = this.line.getX();
        int y = this.line.getY();
        this.line.setX(y);
        this.line.setY(x);
    }

    @Override
    public void symmetryX() {
        this.line.setX(this.line.getX() * -1);
    }

    @Override
    public void symmetryY() {
        this.line.setY(this.line.getY() * -1);
    }
}
