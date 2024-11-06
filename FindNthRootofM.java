import java.util.Scanner;

public class FindNthRootofM {
    public int NthRoot(int n, int m)
    {
        // code here
        int left = 1,right = m;
        // int floor = 0;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(Math.pow(mid,n)==m)
                return mid;
            else if(Math.pow(mid,n)>m)
               { right = mid-1;
               }
            else
               { left = mid+1;
                //   floor = mid;
               }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        
        FindNthRootofM finder = new FindNthRootofM();
        int result = finder.NthRoot(n, m);
        
        if (result != -1) {
            System.out.println("The " + n + "th root of " + m + " is: " + result);
        } else {
            System.out.println("No integer " + n + "th root found for " + m);
        }
        
        scanner.close();
    }
}
