public class InsertionSort {
    static void insert(int arr[],int i)
  {
       for(int j=i;j>=1;j--){
           if(arr[j]<arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
           }
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i=0;i<n;i++){
          insert(arr,i);
      }
  }

  public static void main(String[] args) {
    // Example array
    int[] arr = {12, 11, 13, 5, 6};

    // Create an object of InsertionSort class
    InsertionSort sorter = new InsertionSort();

    // Call the insertionSort method
    sorter.insertionSort(arr, arr.length);

    // Print the sorted array
    System.out.println("Sorted array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
