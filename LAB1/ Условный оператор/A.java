import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();
        input.close();
        System.out.println(Math.max(v, t));

    }
}
