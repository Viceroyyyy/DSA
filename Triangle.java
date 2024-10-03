public class Triangle {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n = 5;  // You can set this to any number you'd like
        Triangle.nTriangle(n);
    }
}