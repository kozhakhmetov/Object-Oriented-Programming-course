import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        for(int i = 2; i <= a; ++i) {
            if (a % i == 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}
