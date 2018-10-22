public class Point {
    public int x, y;

    public Point(int _x, int _y) {
        if (x > 8 || y > 8 || x < 1 || y < 1) {
            x = 0;
            y = 0;
            System.out.print("Out of range");
        }
        x = _x;
        y = _y;
    }

    public boolean equals(Point other) {
        if (!(other instanceof Point)) return false;
        return (x == other.x && y == other.y);
    }
}
