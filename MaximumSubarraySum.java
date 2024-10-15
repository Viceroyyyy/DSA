public class MaximumSubarraySum {
        public int maxSubArray(int[] nums) {
            // Better Approach(O(N^2))
    
            // int maxSum = Integer.MIN_VALUE;
    
            // for(int i=0;i<nums.length;i++){
            //     int sum = 0;
            //     for(int j=i;j<nums.length;j++){
            //         sum+=nums[j];
    
            //         maxSum = Math.max(sum,maxSum);
    
            //     }
            // }
    
            // return maxSum;
    
            int max = Integer.MIN_VALUE;
             int sum = 0;
    
            //  for(int i=0;i<nums.length;i++){
            //     sum+=nums[i];
    
            //     max = Math.max(sum,max);
    
            //     if(sum<0)
            //     sum = 0;
            //  }
            for(int i: nums){
                sum += i;
    
                max = (max>sum)? max:sum;
    
                if(sum<0)
                sum=0;
            }
             return max;
            
        }

        public static void main(String[] args) {
            MaximumSubarraySum solution = new MaximumSubarraySum();
            
            // Test cases
            int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int[] nums2 = {1};
            int[] nums3 = {5, 4, -1, 7, 8};
            
            System.out.println("Maximum subarray sum for nums1: " + solution.maxSubArray(nums1)); // Output: 6
            System.out.println("Maximum subarray sum for nums2: " + solution.maxSubArray(nums2)); // Output: 1
            System.out.println("Maximum subarray sum for nums3: " + solution.maxSubArray(nums3)); // Output: 23
        }
}
