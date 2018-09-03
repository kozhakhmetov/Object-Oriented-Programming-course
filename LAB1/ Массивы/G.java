import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            a[i] = input.nextInt();
        }
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }
    public static boolean getsign(int x) {
        return ((x >= 0) ? true : false);
    }
}