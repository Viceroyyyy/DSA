public class Solution {
    public static void alphaTriangle(int n) {
        
        // Write your code here
        for(int i=0;i<n;i++)
        {int k=64+n;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)k+" ");
                k-=1;
            }
            System.out.print("\n");
        }
    }
}