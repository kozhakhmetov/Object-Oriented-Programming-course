import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i * i <= n; ++i) {
            System.out.println(i * i);
        }
        input.close();
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}