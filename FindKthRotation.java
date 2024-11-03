import java.util.Arrays;
import java.util.List;

public class FindKthRotation {
    public int findKRotation(List<Integer> arr) {
        int left = 0,right = arr.size()-1;
        
        while(left<right){
            
            int mid = (left+right)/2;
            
            if(arr.get(mid)<arr.get(right)){
                right = mid;
            }else{
                left = mid + 1;
            }
            
        }
        
        return left-0;
    }


    public static void main(String[] args) {
        FindKthRotation rotationFinder = new FindKthRotation();

        // Example rotated sorted arrays as lists
        List<Integer> arr1 = Arrays.asList(15, 18, 2, 3, 6, 12); // Expected rotation index: 2
        List<Integer> arr2 = Arrays.asList(7, 9, 11, 12, 5);      // Expected rotation index: 4
        List<Integer> arr3 = Arrays.asList(3, 4, 5, 1, 2);        // Expected rotation index: 3

        // Find and print rotation indexes
        System.out.println("Rotation index in arr1: " + rotationFinder.findKRotation(arr1));
        System.out.println("Rotation index in arr2: " + rotationFinder.findKRotation(arr2));
        System.out.println("Rotation index in arr3: " + rotationFinder.findKRotation(arr3));
    }

}
