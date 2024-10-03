public class TwoForest {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        // Example usage: print a forest with 5 rows
        int n = 5;
        nForest(n);
    }
}