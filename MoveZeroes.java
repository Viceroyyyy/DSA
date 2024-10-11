public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1 && count==0;i++)
        {   if(nums[i]==0){
            
            for(int j=i+1;j<nums.length && count==0;j++){
                if(nums[j]!=0)
                {
                   nums[i] = nums[j];
                   nums[j] = 0; 
                   break;
                }
                if(j==nums.length-1)
                count = 1;
            }

            }
            
        }
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        
        // Example test case
        int[] nums = {0, 1, 0, 3, 12};
        
        // Printing the array before moving zeros
        System.out.println("Before moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        // Call the method to move zeros
        mz.moveZeroes(nums);
        
        // Printing the array after moving zeros
        System.out.println("\nAfter moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
