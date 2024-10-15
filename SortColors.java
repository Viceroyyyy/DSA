public class SortColors {
    public void sortColors(int[] nums) {
        // Brute Force
        // Sort using library function which will take O(NlogN)


        //Better Solution Takes O(2N) time and O(1) space

        //Involves Counting Number of 0s 1s and 2s and overwriting manually 
        // int flag0=0,flag1=0,flag2=0;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]==0)
        //     flag0++;
        //     else if(nums[i]==1){
        //         flag1++;
        //     }else{
        //         flag2++;
        //     }
        // }
        // int index = 0;
        // while(flag0>0){
        //     nums[index] = 0;
        //     flag0--;
        //     index++; 
        // }
        // while(flag1>0){
        //     nums[index] = 1;
        //     flag1--;
        //     index++; 
        // }
        // while(flag2>0){
        //     nums[index] = 2;
        //     flag2--;
        //     index++; 
        // }
        
        //Optimal Solution involves using Dutch National Flag Algorithm
        int low = 0, mid = 0, high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        System.out.println("Array before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        sorter.sortColors(nums);
        
        System.out.println("Array after sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
