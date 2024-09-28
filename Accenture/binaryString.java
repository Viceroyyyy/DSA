// package Accenture;

import java.util.Scanner;

public class binaryString {
    public static int bitWise(String str){
        int a = str.charAt(0)-'0'; //TO convert into Integer we subtract '0' character from any character  
        /*For example, if str[0] is '1', then '1' - '0' evaluates to 1 (integer), because in ASCII, the value of '1' is 49 and that of '0' is 48, so 49 - 48 = 1. */
        for(int i=1; i<str.length(); i++){
            char c = str.charAt(i);
            i++;

            if(c == 'A'){
                a &= str.charAt(i)-'0';
            }
            else if(c == 'B'){
                a |= str.charAt(i)-'0';
            }
            else{
                a ^= str.charAt(i)-'0';
            }
            
        }1
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary string with operations (e.g., 1A0B1): ");
        String input = scanner.nextLine(); // Read the binary string input
        
        int result = bitWise(input); // Call the bitWise method
        System.out.println("Result of bitwise operations: " + result); // Print the result
        
        scanner.close();
    }
}
