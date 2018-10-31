public class Cube implements Shapes {
    double side;
    Cube(double side) {
        this.side = side;
    }
    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return side * side * 6;
    }
}