public class countDigits {
    public static int CountDigits(int n){
        // Write your code here.
        int a=n,count=0,dig=0;
        while(a>0)
        {dig=a%10;
            if(dig!=0 && n%dig==0)
            count++;
        a=a/10;
        }
        return count;
    }


public static void main(String[] args) {
    int number = 1012; // You can change this number to test other cases
    int result = CountDigits(number);
    System.out.println("The number of digits in " + number + " that divide it is: " + result);
}
}

