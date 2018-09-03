import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        if (a > 0) {
            System.out.println(1);
        } else if (a < 0) {
            System.out.println(-1);
        }else {
            System.out.println(0);
        }
    }
}
