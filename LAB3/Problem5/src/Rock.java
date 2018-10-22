public class Rock extends Piece {
    @Override
    public boolean isLegalMove(Point a, Point b) {
        return (a.x == b.x || a.y == b.y);
    }
}
