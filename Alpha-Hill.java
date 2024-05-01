public class Solution {
    public static void alphaHill(int n) {
        
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int k=2*i-1;k<2*n-2;k++)
            {
                System.out.print(" ");
            }
            int l=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)l+" ");
                l+=1;
            }
            l-=1;
            for(int m=1;m<i;m++)
            {l-=1;
                System.out.print((char)l+" ");
            }
            System.out.print("\n");
        }
    }
}