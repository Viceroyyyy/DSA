import java.util.*;
public class sumOfAllDivisors {
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
        public static long sumOfAllDivisors(long N){
        // int sum=1;
        // for(int i=2;i<=n;i++)
        // {
        //     sum=sum+findDiv(i);
        // }
        // return sum;
       
        
            long sum = 0;
            for(long i=1;i<=N;i++)
            {
                sum+=i*(N/i);
            }
            return sum;
        

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number to find out Sum Of All Divisors: ");
            long num = sc.nextLong();

            System.out.println("Sum of All Divisors is: "+sumOfAllDivisors(num));

            sc.close();

            
        }
}