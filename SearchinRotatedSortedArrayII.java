public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int left  = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left + right)/2;

            if(target == nums[mid]){
                return true;
            }
            else if(nums[left]==nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
            else if(nums[left] <= nums[mid]){
                if(nums[left]<=target && target<=nums[mid])
                right = mid-1;
                else
                left = mid+1;
            }else{
                if(nums[mid]<=target && target<=nums[right])
                left = mid+1;
                else
                right = mid-1;
            } 
        }

        return false;
        
    }
    public static void main(String[] args) {
        // Create an instance of the class containing the search method
        SearchinRotatedSortedArrayII main = new SearchinRotatedSortedArrayII();
        
        // Define an example array and a target value
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        // Call the search method and print the result
        boolean result = main.search(nums, target);
        System.out.println("Target " + target + " found in array: " + result);
        
        // Test with another example
        target = 3;
        result = main.search(nums, target);
        System.out.println("Target " + target + " found in array: " + result);
    }
}