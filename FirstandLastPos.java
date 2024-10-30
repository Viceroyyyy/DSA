import java.util.Arrays;

public class FirstandLastPos {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];

        int left = Integer.MIN_VALUE,right = -1;

        int l = 0,r=nums.length-1;
        
        while(l<=r){
            int mid = (l + r)/2;
            
            if(target==nums[mid]){
                left = mid;
                right = mid;
                while(left>=0 && nums[left]==target){
                    left--;
                }

                while(right<nums.length && nums[right]==target){
                    right++;
                }
                break;
            }
            else if(target>nums[mid]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        if(left!=Integer.MIN_VALUE){
            arr[0] = left+1;
            arr[1] = right-1;
        }else{
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;
    }

    public static void main(String[] args) {
        FirstandLastPos obj = new FirstandLastPos();

        // Test Case 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println("Test Case 1: " + Arrays.toString(obj.searchRange(nums1, target1)));

        // Test Case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println("Test Case 2: " + Arrays.toString(obj.searchRange(nums2, target2)));

        // Test Case 3
        int[] nums3 = {};
        int target3 = 0;
        System.out.println("Test Case 3: " + Arrays.toString(obj.searchRange(nums3, target3)));

        // Test Case 4
        int[] nums4 = {1, 1, 1, 1, 1};
        int target4 = 1;
        System.out.println("Test Case 4: " + Arrays.toString(obj.searchRange(nums4, target4)));
    }
}
