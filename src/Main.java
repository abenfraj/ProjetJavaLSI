import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Line a = new Line(10,0,1);
        Line b = new Line(10,1,-1);
        Line c = new Line(10,-1,-1);
        Line d = new Line(10,-1,0);

        ArrayList<Line> l1 = new ArrayList<>();
        l1.add(a);
        l1.add(b);
        l1.add(c);
        l1.add(d);

        Polygon square = new Polygon(l1);
        System.out.println(square.isPolygon());


    }
}