import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; ++i) {
            String cur = s.substring(i, i + k);
            if (smallest.compareTo(cur) > 0 || smallest.equals("")) {
                smallest = cur;
            }
            if (largest.compareTo(cur) < 0) {
                largest = cur;
            }
        }
        return smallest + "\n" + largest;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}