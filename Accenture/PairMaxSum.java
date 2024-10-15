import java.util.*;
public class PairMaxSum {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        int i = 0,j=1;
        int sum = 0,max = 0;
        while(j<arr.size()){
            sum = 0;
            sum = arr.get(i)+arr.get(j);
            i++;
            j++;
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        PairMaxSum solution = new PairMaxSum();

        // Test case 1
        List<Integer> arr1 = Arrays.asList(3, 5, 2, 9, 4);
        System.out.println("Maximum pair sum for arr1: " + solution.pairWithMaxSum(arr1)); // Output: 13 (9 + 4)

        // Test case 2
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Maximum pair sum for arr2: " + solution.pairWithMaxSum(arr2)); // Output: 9 (4 + 5)

        // Test case 3
        List<Integer> arr3 = Arrays.asList(-1, -2, -3, -4, -5);
        System.out.println("Maximum pair sum for arr3: " + solution.pairWithMaxSum(arr3)); // Output: -3 (-1 + -2)
    }
}