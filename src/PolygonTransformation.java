public class PolygonTransformation implements Transformation{

    private Polygon polygon;


    @Override
    public void translation(int value) {
        for (Line line : this.polygon.getLines()) {
            line.setX(line.getX()+value);
            line.setY(line.getY()+value);
        }
    }

    @Override
    public void homothetie(int value) {
        if(value > 0) {
            for (Line line : this.polygon.getLines()) {
                line.setX(line.getX()*value);
                line.setY(line.getY()*value);
            }
        }
        //TODO : Homothetie negative http://deven3d.free.fr/java3d/chap04.htm
    }

    @Override
    public void rotation() {

    }

    @Override
    public void symetrieX() {

    }

    @Override
    public void symetrieY() {

    }
}
