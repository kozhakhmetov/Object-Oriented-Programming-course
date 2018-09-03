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
        for(int i = 0; i < n; ++i) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        input.close();
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}