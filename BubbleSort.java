import java.util.*;

public class BubbleSort {
    
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {// int max=Integer.MIN_VALUE;
    int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]) 
               {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   count=1;
               }
            }
            if(count == 0)
                break;
        }
        
        
        
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array to be sorted: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array to be sortd: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);

        for(int i = 0; i < n; i++){
        System.out.print(arr[i]+", "); 
        }
        sc.close();
    }
}
