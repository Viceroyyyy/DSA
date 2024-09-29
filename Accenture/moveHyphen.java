// package Accenture;

public class moveHyphen {
    public static String MoveHyphen(String str, int n){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)!='-'){
                sb.append(str.charAt(i));
            }
            else{
                count++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<count; i++){
            sb2.append('-');
        }
        return sb2.toString()+sb.toString();
    }
    public static void main(String[] args) {
        // Test cases
        String test1 = "Move-Hyphens-to-Front";
        int n1 = test1.length();
        System.out.println("Original: " + test1);
        System.out.println("Modified: " + MoveHyphen(test1, n1)); // Output: ----abcd
        
        String test2 = "----hello---world---";
        int n2 = test2.length();
        System.out.println("\nOriginal: " + test2);
        System.out.println("Modified: " + MoveHyphen(test2, n2)); // Output: ----------helloworld
        
        String test3 = "no-hyphens-here";
        int n3 = test3.length();
        System.out.println("\nOriginal: " + test3);
        System.out.println("Modified: " + MoveHyphen(test3, n3)); // Output: nohyphenshere
    }

}
