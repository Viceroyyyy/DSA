public class Solution {
    public static void symmetry(int n) {
        for(int i=0;i<n;i++)
        {   
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int k=0;k<4*i;k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l<n;l++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
            }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=4*n-4*i;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}