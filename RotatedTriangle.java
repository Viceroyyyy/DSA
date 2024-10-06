public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.print("\n");
         }
         for(int i=1;i<n;i++)
         {
             for(int j=1;j<=n-i;j++)
             {
                 System.out.print("*");
             }
             System.out.print("\n");
         }
    }
    public static void main(String[] args) {
        // Test the nStarTriangle method with n = 5
        int n = 5;
        nStarTriangle(n);
    }
}