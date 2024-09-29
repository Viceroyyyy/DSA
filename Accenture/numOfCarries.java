// package Accenture;

public class numOfCarries {
    public static int NumberOfCarries(int num1 , int num2){
        int temp = Math.max(num1,num2);
        int carry = 0,count = 0;
        while(temp!=0){
            int rem1= num1%10;
            int rem2= num2%10;

            int sum = rem1+rem2+carry;

            if(sum>=10)
            {   carry = 1;
                count++;
            }
            else 
            carry = 0;

            num1 /= 10;
            num2 /= 10;
            temp/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println("Number of carries between 349 and 451: " + NumberOfCarries(349, 451)); // Output: 0
        System.out.println("Number of carries between 987 and 654: " + NumberOfCarries(987, 654)); // Output: 2
        System.out.println("Number of carries between 999 and 1: " + NumberOfCarries(999, 1)); // Output: 3
        System.out.println("Number of carries between 1000 and 999: " + NumberOfCarries(1000, 999)); // Output: 1
        System.out.println("Number of carries between 12345 and 67890: " + NumberOfCarries(12345, 67890)); // Output: 0
    }
}
