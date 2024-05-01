public class Solution {
    public static void nNumberTriangle(int n) {
        int k=1;
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k+=1;
            }
            System.out.print("\n");
        }
    }
}