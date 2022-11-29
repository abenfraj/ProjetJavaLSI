import java.util.ArrayList;

public class Polygon extends GeometricShape {
    private ArrayList<Line> lines;

    public Polygon(ArrayList<Line> lines) {
        super(0, 0);
        this.lines = lines;
        this.setPerimeter();
        this.setSurface();
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public void setPerimeter() {
        int perimeter = 0;
        for (Line line : lines) {
            perimeter += line.getLength();
        }
        this.setPerimeter(perimeter);
    }

    public void setSurface() {
        int nbOfLines = this.getLines().size();
        int surface = 0;
        int points[][] = new int[nbOfLines][2];
        int xi, yi, xj, yj;
        for (int i = 0; i < nbOfLines; i++) {
            points[i][0] = this.getLines().get(i).getXi();
            points[i][1] = this.getLines().get(i).getYi();
        }
        for(int i = 0; i < nbOfLines; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
        for(int i = 0; i < nbOfLines - 1; ++i) {
            xi = points[i][0];
            yi = points[i][1];
            xj = points[i + 1][0];
            yj = points[i + 1][1];
            surface += (xj * yi) - (xi * yj);
        }
        this.setSurface(surface);
    }

    public boolean isPolygon() {
        if (this.lines.get(0).getXi() == this.lines.get(this.lines.size() - 1).getXj()
                && this.lines.get(0).getYi() == this.lines.get(this.lines.size() - 1).getYj()) {
            return true;
        }
        return false;
    }

}
