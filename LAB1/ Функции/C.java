import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print(Xor(x, y));
        input.close();
    }
    public static int Xor(int x, int y) {
        return (x ^ y);
    }
}