import java.util.*;
public class Solution {
        // public static int findDiv(int num){
        //     int summation=0,k=0;
        //     for(int j=1;j<=Math.sqrt(num);j++)
        //     {       
        //     if(num%j==0)
        //     {
        //         k=num/j;
        //         summation=summation+j+k;
        //     }
        //     }
        //     if(num%Math.sqrt(num)==0)
        //     summation=summation-(int)Math.sqrt(num);
        //     return summation;

        // }
        public static int sumOfAllDivisors(int n){
        // int sum=1;
        // for(int i=2;i<=n;i++)
        // {
        //     sum=sum+findDiv(i);
        // }
        // return sum;
       
    int ans = 0;
    int l = 1;
    while (l <= n) {
        int val = n / l;
        int r = n / val;
        int sum = (r * (r + 1)) / 2 - (l * (l - 1)) / 2;
        ans += sum * val;
        l = r + 1;
    }
    return ans;

        }
}