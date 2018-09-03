import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.close();
        for (int i = a; i <= b; ++i) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }
}
