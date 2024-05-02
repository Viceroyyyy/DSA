public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=0;j<n;j++)
                System.out.print("*");
            }
            else{
            System.out.print("\n");
            System.out.print("*");
            for(int k=1;k<=n-2;k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");}
            System.out.print("\n");
        }
    }
}