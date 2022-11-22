public class PolygonTransformation implements Transformation {

    private Polygon polygon;

    @Override
    public void translation(int value) {
        for (Line line : this.polygon.getLines()) {
            line.setX(line.getX() + value);
            line.setY(line.getY() + value);
        }
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            for (Line line : this.polygon.getLines()) {
                line.setX(line.getX() * factor);
                line.setY(line.getY() * factor);
            }
        }
    }

    @Override
    public void rotation() {
        for (Line line : this.polygon.getLines()) {
            int x = line.getX();
            int y = line.getY();
            line.setX(y);
            line.setY(x);
        }
    }

    @Override
    public void symmetryX() {
        for (Line line : this.polygon.getLines()) {
            line.setX(line.getX() * -1);
        }
    }

    @Override
    public void symmetryY() {
        for (Line line : this.polygon.getLines()) {
            line.setY(line.getY() * -1);
        }
    }
}
