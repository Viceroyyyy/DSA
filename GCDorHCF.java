public class GCDorHCF {
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
    public static void main(String[] args) {
        int num1 = 56; // You can change the values here for testing
        int num2 = 98;

        int result = calcGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}