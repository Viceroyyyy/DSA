import java.util.HashMap;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        // int left=0,right=1;
        int[] arr = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     while(left<right){
        //         if(nums[left]+nums[right] == target)
        //         {
        //             arr[0]=left;
        //             arr[1]=right;
        //             return arr;
        //         }
        //         left++;
        //     }
        //     right++;
        // }

        // return arr;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];

            if(map.containsKey(rem))
            {
                arr[0] = i;
                arr[1] = map.get(rem);
                return arr;
            }
            map.put(nums[i],i);
        }

        return arr;
    }
    public static void main(String[] args) {
        TwoSum twoSumSolver = new TwoSum();

        // Sample input array and target value
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = twoSumSolver.twoSum(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers sum up to the target.");
        }
    }
}
