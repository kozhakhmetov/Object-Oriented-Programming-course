public class Knight extends Piece {
    @Override
    public boolean isLegalMove(Point a, Point b) {
        int first = Math.abs(a.x - b.x);
        int second = Math.abs(a.y - b.y);
        return ((first == 2 && second == 1) || (first == 1 && second == 2));
    }
}
