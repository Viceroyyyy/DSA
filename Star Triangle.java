public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            // for(int k=1;k<=n-i;k++)
            // {
            //     System.out.print(" ");
            // }
            System.out.print("\n");
        }
    }
}