import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        if (((a != 1) ^ (b != 1)) == true) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
