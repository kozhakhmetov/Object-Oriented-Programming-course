public class Cylinder2 extends Shape {
    double radius, height;
    Cylinder2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double volume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public double surfaceArea() {
        return (radius * 2 * Math.PI * height) + (2 * radius * radius * Math.PI );
    }
}
