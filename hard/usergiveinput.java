import java.util.Scanner;

public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        int n = s.length();

       
        int end = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (isPalindrome(s, 0, i)) {
                end = i;
                break;
            }
        }

        
        StringBuilder prefix = new StringBuilder(s.substring(end + 1)).reverse();
        return prefix + s;
    }

   
    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String output = shortestPalindrome(input);
        System.out.println("Output: " + output);

    
        scanner.close();
    }
}
