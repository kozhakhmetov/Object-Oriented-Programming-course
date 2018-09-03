import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        for (int i = a; i <= b; ++i) {
            if (check(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}
