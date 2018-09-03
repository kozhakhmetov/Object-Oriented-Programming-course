import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        input.close();
        if ((v % 4 == 0 && v % 100 != 0) || v % 400 == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
