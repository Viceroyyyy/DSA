public class Solution {
    public static boolean palindromeNumber(int n){
int temp=n;
        int rem,sum=0;
        while(n!=0)
        {
        rem=n%10;
        sum=sum*10+rem;
        n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
}