class N_Forest{
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n = 5; // You can change this value to create a different size forest
        nForest(n);
    }
}
/*
 Output 

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
*/ 