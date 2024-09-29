// package Accenture;

public class n_BaseNotation {
    public static String DectoNBase(int n,int num){

        StringBuilder str = new StringBuilder();

        int rem =0;
        while(num!=0){
            rem = num%n;

            if(rem<10){
                str.append(rem);
            }
            else
            {
                rem -= 10;
                str.append((char)(rem+'A'));
            }
            num /= n;
        }

        return str.reverse().toString();
    }
    public static void main(String[] args) {
        // Test with some example values
        int n = 12; // Base 16
        int num = 718; // Decimal number

        String result = DectoNBase(n, num);
        System.out.println(num + " in base " + n + " is: " + result);

        // Additional test cases
        int n2 = 2; // Base 2
        int num2 = 10; // Decimal number
        String result2 = DectoNBase(n2, num2);
        System.out.println(num2 + " in base " + n2 + " is: " + result2);

        int n3 = 36; // Base 36
        int num3 = 123456; // Decimal number
        String result3 = DectoNBase(n3, num3);
        System.out.println(num3 + " in base " + n3 + " is: " + result3);
    }
}
