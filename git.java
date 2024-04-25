import java.util.Scanner;
public class DSA {
    // public static void chkPrime(int a)
    // {
    //     for (int i = a/2; i > 1 ; i--)
    //     {
    //         if(a % i == 0)
    //         {
    //             System.out.println("It is a prime");
    //             return;
    //         }
    //     }
    //     System.out.println("Not a prime");
    // }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the name array: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int divs=0,divd=0;
        if(a>b)
        {
            divs=b;
            divd=a;
        }
        else{
            divs=a;
            divd=b;
        }

        int rem=1;
        while(rem>=0)
        {
            if(divd%divs==0)
            {
                rem=0;
            }
            else{
                rem=divd%divs;
                divd=divs;
                divs=rem;
            }

        }
        System.out.println("HCF is:"+divs);

        //  chkPrime(a);
        // String names[] = new String[a];
        // System.out.println("Enter the name array: ");
        // for (int i = 0; i < names.length; i++)
        // {
        //     names[i] = scanner.next();       //Array for names
        // }
        // for (int i = 0; i<names.length; i++)
        // {
        //     System.out.println(" " + names[i]);
        // }
    //------------------------------------------------------------------------------------------------
        // int arr[] = new int[a];
        // for(int i = 0; i < arr.length; i++)
        // {
        //     arr[i]= scanner.nextInt();
        // }
        // int max=Integer.MAX_VALUE; //Initialized with max value that a integer can hold
        // for(int i=0; i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     max=arr[i];
        // }
        // System.out.println("Maximum Element is: "+max);
    }
}
