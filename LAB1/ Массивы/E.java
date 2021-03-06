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
        for(int i = 1; i < n; ++i) {
            cnt += ((getsign(a[i]) == getsign(a[i - 1])) ? 1 : 0);
        }
        if (cnt > 0) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
        input.close();
    }
    public static boolean getsign(int x) {
        return ((x >= 0) ? true : false);
    }
}