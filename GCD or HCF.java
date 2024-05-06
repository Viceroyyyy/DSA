public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
         int Q,div;
    if(n>m)
    {
        div=n;
        Q=m;
    }
    else{
        div=m;
        Q=n;
    }
    int rem=1;
    while(rem!=0)
    {
        rem=div%Q;
        if(rem==0)
        break;
        else {
        div = Q;
        Q = rem;
        }
    }
    return Q;
    }
}