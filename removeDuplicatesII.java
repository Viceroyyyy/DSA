public class removeDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        if(nums.length==1 || nums.length==2)
        return nums.length;

        if(nums[0]==nums[1])
        index++;
        
        for(int i=1 ;i<nums.length;i++)
        {
            if(nums[i]!=nums[index])
            {
                index++;
                nums[index]=nums[i];
                if((i+1)<nums.length && nums[i]==nums[i+1])
                {
                    index++;
                    nums[index]=nums[i];
                }
            }
        }

        return index+1;
    }
    public static void main(String[] args) {
        removeDuplicatesII solution = new removeDuplicatesII();
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};

        // Call the removeDuplicates method
        int newLength = solution.removeDuplicates(nums);

        // Print the result
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after allowing at most two duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
