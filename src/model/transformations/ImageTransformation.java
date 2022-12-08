package model.transformations;

import model.shapes.Circle;
import model.shapes.Ellipsis;
import model.shapes.GeometricShape;
import model.shapes.Polygon;

import java.util.TreeSet;

public class ImageTransformation implements Transformation{

    private TreeSet<GeometricShape> shapes;
    private PolygonTransformation polygonTransformation;
    private CircleTransformation circleTransformation;
    private EllipsisTransformation ellipsisTransformation;

    public ImageTransformation(TreeSet<GeometricShape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void translation(int value) {
        for(GeometricShape shape : this.shapes) {
            if(shape instanceof Polygon) {
                this.polygonTransformation = new PolygonTransformation((Polygon) shape);
                this.polygonTransformation.translation(value);
            }
            if(shape instanceof Circle) {
                this.circleTransformation = new CircleTransformation((Circle) shape);
                this.circleTransformation.translation(value);
            }
            if(shape instanceof Ellipsis) {
                this.ellipsisTransformation = new EllipsisTransformation((Ellipsis) shape);
                this.ellipsisTransformation.translation(value);
            }
        }
    }

    @Override
    public void dilation(int value) {
        for(GeometricShape shape : this.shapes) {
            if(shape instanceof Polygon) {
                this.polygonTransformation = new PolygonTransformation((Polygon) shape);
                this.polygonTransformation.dilation(value);
            }
            if(shape instanceof Circle) {
                this.circleTransformation = new CircleTransformation((Circle) shape);
                this.circleTransformation.dilation(value);
            }
            if(shape instanceof Ellipsis) {
                this.ellipsisTransformation = new EllipsisTransformation((Ellipsis) shape);
                this.ellipsisTransformation.dilation(value);
            }
        }
    }

    @Override
    public void rotation() {
        for (GeometricShape geometricShape : this.shapes) {
            if(geometricShape instanceof Polygon) {
                this.polygonTransformation = new PolygonTransformation((Polygon) geometricShape);
                this.polygonTransformation.rotation();
            }
        }

    }

    @Override
    public void symmetryX() {
        for (GeometricShape geometricShape : this.shapes) {
            if(geometricShape instanceof Polygon) {
                this.polygonTransformation = new PolygonTransformation((Polygon) geometricShape);
                this.polygonTransformation.symmetryX();
            }
        }

    }

    @Override
    public void symmetryY() {
        for (GeometricShape geometricShape : this.shapes) {
            if(geometricShape instanceof Polygon) {
                this.polygonTransformation = new PolygonTransformation((Polygon) geometricShape);
                this.polygonTransformation.symmetryY();
            }
        }

    }
}
