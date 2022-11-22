public class CircleTransformation implements Transformation{
    private Circle circle;

    @Override
    public void translation(int value) {
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            this.circle.setRadius(this.circle.getRadius() * factor);
        }
    }

    @Override
    public void rotation() {
    }

    @Override
    public void symmetryX() {
    }

    @Override
    public void symmetryY() {
    }

}
