public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
       for(int i=0;i<nums.length;i++) {
        if(nums[i]==1)
        {
            count++;
        }else{
            if(count>max){
                max = count;
            }
        
            count = 0;
        }

       }
       if(count>max)
       return count;
       else 
       return max;

    }
    public static void main(String[] args) {
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();

        // Example test case
        int[] nums = {1, 1, 0, 1, 1, 1};

        // Finding the maximum number of consecutive ones
        int result = mco.findMaxConsecutiveOnes(nums);

        // Printing the result
        System.out.println("Maximum number of consecutive ones: " + result);
    }
}
