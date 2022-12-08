package model.transformations;

import model.shapes.Circle;

public class CircleTransformation implements Transformation {
    private Circle circle;

    public CircleTransformation(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void translation(int value) {
        this.circle.setRadius(this.circle.getRadius() + value);
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
