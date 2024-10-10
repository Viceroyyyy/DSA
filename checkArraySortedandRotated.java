public class checkArraySortedandRotated {
    
        public boolean check(int[] nums) {
            int flag = 0;
    
            if(nums[0]<nums[nums.length-1]){
                flag++;
            }
    
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]<nums[i-1])
                {
                    flag++;
                    if(flag>1)
                    return false;
                }
            }
    
            return true;
            
        }
        public static void main(String[] args) {
            checkArraySortedandRotated solution = new checkArraySortedandRotated();
            
            // Test case 1
            int[] nums1 = {3, 4, 5, 1, 2};
            System.out.println("Array: [3, 4, 5, 1, 2]");
            System.out.println("Is sorted and rotated: " + solution.check(nums1)); // Output: false
    
            // Test case 2
            int[] nums2 = {2, 1, 3, 4};
            System.out.println("Array: [2, 1, 3, 4]");
            System.out.println("Is sorted and rotated: " + solution.check(nums2)); // Output: false
    
            // Test case 3
            int[] nums3 = {1, 2, 3, 4, 5};
            System.out.println("Array: [1, 2, 3, 4, 5]");
            System.out.println("Is sorted and rotated: " + solution.check(nums3)); // Output: true
    
            // Test case 4
            int[] nums4 = {4, 5, 1, 2, 3};
            System.out.println("Array: [4, 5, 1, 2, 3]");
            System.out.println("Is sorted and rotated: " + solution.check(nums4)); // Output: true
        }
}
