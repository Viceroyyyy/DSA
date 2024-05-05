public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int a=n,count=0,dig=0;
        while(a>0)
        {dig=a%10;
            if(dig==0)
            count=count;
            else if(n%dig==0)
            count++;
        a=a/10;
        }
        return count;
    }
}