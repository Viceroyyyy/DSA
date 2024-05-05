class Solution {
    public int reverse(int x) {
        long rem,sum=0;
        while(x!=0)
        {
        rem=x%10;
        sum=sum*10+rem;
        x=x/10;
        }
        // System.out.println(sum);
        if(sum>-2147483647 && sum<2147483647)
        return (int)sum;
        else
        return 0;
    }

}