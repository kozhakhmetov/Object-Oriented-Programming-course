public class Point2 extends Shape {
    double x, y;
    Point2(double x, double y) {
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
