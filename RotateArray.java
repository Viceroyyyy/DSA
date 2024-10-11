public class RotateArray {
    public static void reverse(int nums[],int strt,int end){
        while(strt<end)
        {
            int temp = nums[strt];
            nums[strt] = nums[end];
            nums[end] = temp;
            strt++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    } 
    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        
        // Test case
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Print original array
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Perform rotation
        solution.rotate(nums, k);

        // Print rotated array
        System.out.println("\nArray after rotating by " + k + " positions:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
