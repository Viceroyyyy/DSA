public class Alpha_Ramp {
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
    public static void main(String[] args) {
        // Example usage
        int n = 5; // You can change this value to test with other inputs
        alphaRamp(n);
    }
}