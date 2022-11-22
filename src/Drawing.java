import java.util.TreeSet;

public class Drawing {
    private TreeSet<Image> images;
    private int perimeter;
    private int surface;

    public Drawing(TreeSet<Image> images) {
        this.images = images;
        this.setPerimeter();
        this.setSurface();
    }

    public TreeSet<Image> getImages() {
        return this.images;
    }

    public int setPerimeter() {
        int perimeter = 0;
        for (Image image : images) {
            perimeter += image.getPerimeter();
        }
        this.perimeter = perimeter;
        return perimeter;
    }

    public int setSurface() {
        int surface = 0;
        for (Image image : images) {
            surface += image.getSurface();
        }
        this.surface = surface;
        return surface;
    }

    public Drawing copy() {
        TreeSet<Image> imagesCopyOfDrawing = new TreeSet<>();
        Drawing copyOfDrawing = new Drawing(imagesCopyOfDrawing);
        for (Image image : this.getImages()) {
            imagesCopyOfDrawing.add(image);
        }
        return copyOfDrawing;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "images=" + images +
                '}';
    }
}
