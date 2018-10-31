public class Main {

    public static void main(String[] args) {
        int a[] = {0, 8 , -3, 20};
        MinMax m = new MinMax();
        MinMax.Pair minMax = m.minmax(a);
        minMax.getMin();
        minMax.getMax();
    }
}
