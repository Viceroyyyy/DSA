// package Accenture;

public class replaceChar {
    public static String ReplaceCharacter(String str, int n, char ch1, char ch2){
        if(n == 0) 
        return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ch1)
            sb.append(ch2);
            else if(str.charAt(i) == ch2){
                sb.append(ch1);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // Test cases
        String test1 = "hello world";
        System.out.println("Original: " + test1);
        System.out.println("Modified: " + ReplaceCharacter(test1, test1.length(), 'h', 'w')); // Output: "wello horld"

        String test2 = "apples";
        System.out.println("\nOriginal: " + test2);
        System.out.println("Modified: " + ReplaceCharacter(test2, test2.length(), 'a', 'p')); // Output: "Jovo Progrommong"

        String test3 = "OpenAI";
        System.out.println("\nOriginal: " + test3);
        System.out.println("Modified: " + ReplaceCharacter(test3, test3.length(), 'O', 'I')); // Output: "ipenAI"

        String test4 = "abcdef";
        System.out.println("\nOriginal: " + test4);
        System.out.println("Modified: " + ReplaceCharacter(test4, test4.length(), 'a', 'z')); // Output: "zbcdef"

        String test5 = ""; // Empty string
        System.out.println("\nOriginal: [" + test5 + "]");
        System.out.println("Modified: " + ReplaceCharacter(test5, test5.length(), 'x', 'y')); // Output: null
    }
}
