import java.util.ArrayList;
import java.util.TreeSet;

public class findUnion {
    public static ArrayList<Integer> findUnion1(int arr1[], int arr2[], int n, int m)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++)
        {
            set.add(arr2[i]);
        }
        
        ArrayList<Integer> arr = new ArrayList<>(set);
        
        return arr;
    }
    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        int n = arr1.length;
        int m = arr2.length;

        // Calling the findUnion1 method
        ArrayList<Integer> unionResult = findUnion1(arr1, arr2, n, m);

        // Printing the union result
        System.out.println("Union of the two arrays: ");
        for (int num : unionResult) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
