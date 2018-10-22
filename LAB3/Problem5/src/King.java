public class King extends Piece {
    @Override
    public boolean isLegalMove(Point a, Point b) {
        return (Math.abs(a.x - b.x) < 2 && Math.abs(a.y - b.y) < 2);
    }
}
