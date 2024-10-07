import java.util.Scanner;

public class SelectionSort {
    
	public static int  select(int arr[], int i)
	{int min = Integer.MAX_VALUE;
	int index = 0 ;
        // code here such that selectionSort() sorts arr[]
        for(int j=i;j<arr.length;j++){
            if(arr[j]<min)
            {
                min = arr[j];
                index = j;
            }
        }
        
        return index;

	}
	
	public static void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<arr.length;i++){
	      int index = select(arr,i);
	      int temp = arr[i];
	      arr[i] = arr[index];
	      arr[index] = temp;
	    }
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array to be sorted: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array to be sortd: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);

        for(int i = 0; i < n; i++){
        System.out.print(arr[i]+", "); 
        }
        sc.close();
    }

}
