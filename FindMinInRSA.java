public class FindMinInRSA {
    public int findMin(int[] nums) {
        int left = 0,right = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(left<right){
            int mid = (left+right)/2;

            min = Math.min(min,nums[mid]);

            // if(nums[left]==nums[right]){
            //     return min;
            // }
            // else 
            // if(nums[left]<=nums[right]){
            //     // if(nums[right]<nums[left]){
            //     //     left = mid+1;
            //     // }else{
            //     //     right = mid-1;
            //     // }
            //     // continue;
            //     right = mid-1;
            // }else{
            //     // if(nums[left]<nums[right]){
            //     //     right = mid-1;
            //     // }else{
            //     //     left = mid+1;
            //     // }
            //     // continue;
            //     left = mid+1;
            // }

            // // return min;
            if (nums[mid] < nums[right]) {
                // Minimum is in the left half including mid
                right = mid;
            } else {
                // Minimum is in the right half excluding mid
                left = mid + 1;
            }
        }
        
        
        
        // return min;
        return nums[left];
    }

    public static void main(String[] args) {
        FindMinInRSA finder = new FindMinInRSA();

        // Example rotated sorted arrays
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {3, 4, 5, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        // Find and print minimums
        System.out.println("Minimum in nums1: " + finder.findMin(nums1)); // Output should be 0
        System.out.println("Minimum in nums2: " + finder.findMin(nums2)); // Output should be 1
        System.out.println("Minimum in nums3: " + finder.findMin(nums3)); // Output should be 11
    }
}
