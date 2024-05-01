public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        int k=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k+" ");
            }
            k+=1;
            System.out.print("\n");
        }
    }
}