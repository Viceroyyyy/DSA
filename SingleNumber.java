public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            ans = ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        // Example test case
        int[] nums = {4, 1, 2, 1, 2};

        // Finding the single number in the array
        int result = sn.singleNumber(nums);

        // Printing the result
        System.out.println("The single number is: " + result);
    }
}
