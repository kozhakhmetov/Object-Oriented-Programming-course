public class MinMax {
    static class Pair{
        int min, max;
        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMax() {
            return max;
        }

        public int getMin() {
            return min;
        }
    }

    static Pair minmax(int values[]) {
        int curmx = values[0];
        int curmn = values[0];
        for(int it : values) {
            curmx = Math.max(curmx, it);
            curmn = Math.min(curmn, it);
        }
        return new Pair(curmn, curmx);
    }
}