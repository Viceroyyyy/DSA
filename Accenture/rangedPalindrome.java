import java.util.*;

public class rangedPalindrome {
    public static boolean checkPalindrome(int num){
        int temp =num;
        int rev=0;

        if(num<10)
        return false;

        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp /= 10;
        }
        if(rev == num)
        return true;
        else 
        return false;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the lowerlimit of the range:");
        int lower_limit = sc.nextInt();
        System.out.print("Enter the upperlimit of the range:");
        int upper_limit = sc.nextInt();
        
        for(int i=lower_limit; i<upper_limit; i++){
            if(checkPalindrome(i)){
                System.out.println(""+i+", ");
            }
        }
    }
}
