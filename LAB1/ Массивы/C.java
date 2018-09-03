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
        int cnt = 0;
        for(int i = 0; i < n; ++i) {
            cnt += (a[i] > 0 ? 1 : 0);
        }
        System.out.print(cnt);
        input.close();
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}