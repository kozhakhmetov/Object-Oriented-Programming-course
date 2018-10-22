public class Cube extends Objects3D {
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
