import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 100; ++i) {
            sum += input.nextInt();
        }
        System.out.println(sum);
        input.close();
    }
    public static boolean check(int x) {
        return (((int)Math.sqrt(x) * (int)(Math.sqrt(x))) == x);
    }
}