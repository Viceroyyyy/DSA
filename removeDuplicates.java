public class removeDuplicates {
    public int removeDuplicatesI(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
         int k = 1;
         for(int i=1; i< nums.length; i++){
             if(nums[i-1] != nums[i]){
                 nums[k] = nums[i];
                 k++;
             }
         }
         return k;
     }

     public static void main(String[] args) {
        removeDuplicates solution = new removeDuplicates();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        // Call the removeDuplicatesI method
        int newLength = solution.removeDuplicatesI(nums);

        // Print the result
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
