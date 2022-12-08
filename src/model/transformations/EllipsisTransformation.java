package model.transformations;

import model.shapes.Ellipsis;

public class EllipsisTransformation implements Transformation {
    private Ellipsis ellipsis;

    public EllipsisTransformation(Ellipsis shape) {
        this.ellipsis = shape;
    }

    @Override
    public void translation(int value) {
        this.ellipsis.setRadius1(this.ellipsis.getRadius1() + value);
        this.ellipsis.setRadius2(this.ellipsis.getRadius2() + value);
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            this.ellipsis.setRadius1(this.ellipsis.getRadius1() * factor);
            this.ellipsis.setRadius2(this.ellipsis.getRadius2() * factor);
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
