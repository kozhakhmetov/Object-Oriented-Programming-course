import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();
        input.close();
        if (v >= 0) {
            System.out.println((v * t) % 109);
        }else {
            System.out.println((109 - Math.abs(v * t) % 109) % 109);
        }
    }
}
