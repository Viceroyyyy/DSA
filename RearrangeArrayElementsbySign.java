public class RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        // int i = 0,j;

        // while(i<nums.length){
        //     j = i+1;
        //     if(nums[i]>0){
        //         if(j<nums.length && nums[j]<0){
        //             i++;
        //         }
        //         else{
        //             while(j<nums.length && nums[j]>0){
        //                 j++;
        //             }
        //             if(i+1<nums.length){

        //               int temp = nums[i+1];
        //             nums[i+1] = nums[j];
        //             nums[j] = temp;
  
        //             }
                    
        //             i++;
        //         }
        //     }else{
        //         if(j<nums.length && nums[j]>0){
        //             if(i==0){
        //               int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp; 
        //              i++;
        //             }else
        //             i++;
        //         }
        //         else{
        //             while(j<nums.length && nums[j]<0){
        //                 j++;
        //             }
        //             if(i+1<nums.length){
        //             int temp = nums[i+1];
        //             nums[i+1] = nums[j];
        //             nums[j] = temp;}

        //             i++;
        //             }
        //     }
        // }

        // return nums;
        int odd_index = 1;
        int even_index = 0;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[odd_index] = nums[i];
                odd_index+=2;
            }else{
                arr[even_index] = nums[i];
                even_index+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        RearrangeArrayElementsbySign stock = new RearrangeArrayElementsbySign();
        
        // Example input
        int[] nums = {3, -2, 5, -7, 8, -1};
        
        // Rearranging the array
        int[] rearranged = stock.rearrangeArray(nums);
        
        // Printing the result
        System.out.print("Rearranged array: ");
        for (int num : rearranged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
