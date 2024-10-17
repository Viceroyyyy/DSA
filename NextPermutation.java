import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1 ;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                index = i ;
            }
        }
        if(index < 0){
            for(int i = index+1,j=nums.length-1;i<j;i++,j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        }
        else{

        for(int j = nums.length-1;j>index;j--){
            if(nums[j]>nums[index]){
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;

                break;
            }
        }

        for(int i = index+1,j=nums.length-1;i<j;i++,j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        }
    }

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();

        // Test case 1
        int[] nums1 = {1, 2, 3};
        permutation.nextPermutation(nums1);
        System.out.println("Next Permutation: " + Arrays.toString(nums1));

        // Test case 2
        int[] nums2 = {3, 2, 1};
        permutation.nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2));

        // Test case 3
        int[] nums3 = {1, 1, 5};
        permutation.nextPermutation(nums3);
        System.out.println("Next Permutation: " + Arrays.toString(nums3));

        // Test case 4
        int[] nums4 = {1, 3, 2};
        permutation.nextPermutation(nums4);
        System.out.println("Next Permutation: " + Arrays.toString(nums4));
    }
}
