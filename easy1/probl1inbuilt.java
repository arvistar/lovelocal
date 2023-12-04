public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
      
        s = s.trim();
        
        
        if (s.isEmpty()) {
            return 0;
        }
        
        
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        
       
        return lastWord.length();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int output = lengthOfLastWord(input);
        System.out.println("Output: " + output);
    }
}
