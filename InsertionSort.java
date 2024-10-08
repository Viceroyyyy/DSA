public class InsertionSort {
    
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int i)
  { 
    if(i==arr.length)
      return ;
          
          for(int j=i;j>=1 && arr[j]<arr[j-1];j--){  
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
    }
      

      insertionSort(arr, i+1);
  }

  public static void main(String[] args) {
    // Example array
    int[] arr = {12, 11, 13, 5, 6};

    // Create an object of InsertionSort class
    InsertionSort sorter = new InsertionSort();

    // Call the insertionSort method
    sorter.insertionSort(arr, 0);

    // Print the sorted array
    System.out.println("Sorted array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
