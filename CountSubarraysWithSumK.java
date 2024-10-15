import java.util.HashMap;

public class CountSubarraysWithSumK {
    
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();

    int sum=  0,count = 0;

    for(int i=0;i<nums.length;i++){
        sum += nums[i]; 

        int rem = sum - k;

        if(map.containsKey(rem)){
            count+=map.get(rem);
        }

        int prevCount = 0;

        if(map.containsKey(sum))
        prevCount = map.get(sum);

        map.put(sum,prevCount+1);
    }

    return count;
    
}

public static void main(String[] args) {
    CountSubarraysWithSumK solution = new CountSubarraysWithSumK();

    // Example 1
    int[] nums1 = {1, 1, 1};
    int k1 = 2;
    System.out.println("Number of subarrays with sum " + k1 + ": " + solution.subarraySum(nums1, k1)); 
    // Output: 2

    // Example 2
    int[] nums2 = {1, 2, 3};
    int k2 = 3;
    System.out.println("Number of subarrays with sum " + k2 + ": " + solution.subarraySum(nums2, k2)); 
    // Output: 2

    // Example 3
    int[] nums3 = {3, 4, 7, 2, -3, 1, 4, 2};
    int k3 = 7;
    System.out.println("Number of subarrays with sum " + k3 + ": " + solution.subarraySum(nums3, k3)); 
    // Output: 4
}
}
