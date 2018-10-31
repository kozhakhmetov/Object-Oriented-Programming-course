public class Point implements Shapes {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 0;
    }
}
