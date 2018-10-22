public class Queen extends Piece {
    @Override
    public boolean isLegalMove(Point a, Point b) {
        return (a.x == b.x || b.y == a.y || (Math.abs(a.x - b.x) == Math.abs(a.y - b.y)));
    }
}
