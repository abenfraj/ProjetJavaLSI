package model.transformations;

import model.shapes.Line;
import model.shapes.Polygon;

public class PolygonTransformation implements Transformation {

    private Polygon polygon;

    public PolygonTransformation(Polygon polygon) {
        this.polygon = polygon;
    }

    @Override
    public void translation(int value) {
        for (Line line : this.polygon.getLines()) {
            line.setXi(line.getXi() + value);
            line.setYi(line.getYi() + value);
            line.setXj(line.getXj() + value);
            line.setYj(line.getYj() + value);
        }
    }

    @Override
    public void dilation(int factor) {
        if (factor > 0) {
            for (Line line : this.polygon.getLines()) {
                line.setXi(line.getXi() * factor);
                line.setYi(line.getYi() * factor);
                line.setXj(line.getXj() * factor);
                line.setYj(line.getYj() * factor);
            }
        }
    }

    @Override
    public void rotation() {
        for (Line line : this.polygon.getLines()) {
            int xi = line.getXi();
            int yi = line.getYi();
            int xj = line.getXj();
            int yj = line.getYj();
            line.setXi(yi);
            line.setYi(xi);
            line.setXj(yj);
            line.setYj(xj);
        }
    }

    @Override
    public void symmetryX() {
        for (Line line : this.polygon.getLines()) {
            line.setXi(line.getXi() * -1);
            line.setXj(line.getXj() * -1);
        }
    }

    @Override
    public void symmetryY() {
        for (Line line : this.polygon.getLines()) {
            line.setYi(line.getYi() * -1);
            line.setYj(line.getYj() * -1);
        }
    }
}
