import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        int counter = 0;
        for(int i = 1; i * i <= a; ++i) {
            if (a % i == 0) {
                counter += 1 + (i * i != a ? 1 : 0);
            }
        }
        System.out.println(counter);
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}