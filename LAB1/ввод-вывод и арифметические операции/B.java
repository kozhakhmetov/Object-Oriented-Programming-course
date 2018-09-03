import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        System.out.println(String.format("The next number for the number %s is %s.", a, a + 1));

        System.out.println(String.format("The previous number for the number %s is %s.", a, a - 1));

    }
}
