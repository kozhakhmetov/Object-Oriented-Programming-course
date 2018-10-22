public class Pawn extends Piece {
    @Override
    public boolean isLegalMove(Point a, Point b) {
        return (Math.abs(a.y - b.y) <= 2 && a.x == b.x);
    }
}
