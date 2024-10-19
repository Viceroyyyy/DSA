import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        //Better Solution
        // Arrays.sort(nums);
        // if(nums.length>0){
        //     int element = nums[0] , count = 0;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(element == nums[i]){
        //         element++;
        //         count++;
        //     }else if(nums[i]==nums[i-1]){

        //         continue;

        //     }
        //     else{
        //         element = nums[i];
        //         element++;
        //         count = 1;
        //     }
        //     max = Math.max(count,max);
        // }

        // return max;
        // }else{
        //     return 0;
        // }


        //Optimal Solution

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxCount = -1;
        for(int element: set){
            if(!set.contains(element-1)){
                int strt_element = element;
                int count = 1;

                while(set.contains(strt_element+1)){
                    strt_element++;
                    count++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }

        if(maxCount>=0)
        return maxCount;
        else return 0;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        // Test case 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums1));  // Output: 4

        // Test case 2
        int[] nums2 = {0, -1, 1, 2, -2};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums2));  // Output: 5

        // Test case 3
        int[] nums3 = {10, 5, 15};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums3));  // Output: 1

        // Test case 4 (Empty array)
        int[] nums4 = {};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums4));  // Output: 0

        // Test case 5 (Array with duplicates)
        int[] nums5 = {1, 2, 2, 3};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums5));
    }
}
