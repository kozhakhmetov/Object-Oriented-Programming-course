public class Rook extends Piece {

    @Override
    public boolean isLegalMove(Point a, Point b) {
        return Math.abs(a.x - b.x) == Math.abs(a.y - b.y);
    }
}
