class Cylinder extends Objects3D {
    double radius, height;

    @Override
    public double volume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * radius * Math.PI * height + radius * radius * Math.PI * 2;
    }
}
