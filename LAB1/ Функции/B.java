import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        long k = input.nextInt();
        System.out.print(pw(n, k));
        input.close();
    }
    public static double pw(double n, long k) {
        double ans = 1;
        for(int i = 1; i <= k; ++i) {
            ans *= n;
        }
        return ans;
    }
}