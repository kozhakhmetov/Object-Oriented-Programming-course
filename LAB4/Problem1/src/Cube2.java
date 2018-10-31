public class Cube2 extends Shape {
    double side;
    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return side * side * 6;
    }
}