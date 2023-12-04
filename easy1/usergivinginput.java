import java.util.Scanner;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
  
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                return words[i].length();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int output = lengthOfLastWord(input);
        System.out.println("Length of the last word: " + output);
        scanner.close();
    }
}
