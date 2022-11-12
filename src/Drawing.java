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
}
