package model.transformations;

import model.frames.Image;

import java.util.TreeSet;

public class DrawingTransformation implements Transformation{

    private TreeSet<Image> images = new TreeSet<>();
    private ImageTransformation imageTransformation;

    public DrawingTransformation(TreeSet<Image> images) {
        this.images = images;
    }


    @Override
    public void translation(int value) {
        for (Image image : this.images) {
            this.imageTransformation = new ImageTransformation(image.getShapes());
            imageTransformation.translation(value);
        }
    }

    @Override
    public void dilation(int value) {
        for (Image image : this.images) {
            this.imageTransformation = new ImageTransformation(image.getShapes());
            imageTransformation.dilation(value);
        }
    }

    @Override
    public void rotation() {
        for (Image image : this.images) {
            this.imageTransformation = new ImageTransformation(image.getShapes());
            imageTransformation.rotation();
        }
    }

    @Override
    public void symmetryX() {
        for (Image image : this.images) {
            this.imageTransformation = new ImageTransformation(image.getShapes());
            imageTransformation.symmetryX();
        }
    }

    @Override
    public void symmetryY() {
        for (Image image : this.images) {
            this.imageTransformation = new ImageTransformation(image.getShapes());
            imageTransformation.symmetryY();
        }
    }
}
