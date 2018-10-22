public class Cylinder implements Shapes {
    double radius, height;
    Cylinder(double radius, double height) {
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
