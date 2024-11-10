public class KthMissingPosNum {
    // public static boolean binsearch(int[] nums,int num){
    //     int left =0,right = nums.length-1;

    //     while(left<=right){
    //         int mid = (left+right)/2;

    //         if(nums[mid]==num)
    //         return true;
    //         else if(num>nums[mid]){
    //             left = mid+1;
    //         }else{
    //             right = mid-1;
    //         }
    //     }

    //     return false;
    // }
    public int findKthPositive(int[] nums, int k) {
        // int index = 0,num = 1;
        // while(index<k){
        //     if(!binsearch(arr,num)){
        //         index++;
        //     }

        //     if(index==k)
        //     return num;

        //     num++;
        // }

        // return -1;

        int left = 0,right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]-(mid+1)<k)
            left=mid+1;
            else
            right = mid-1;
        }

        // return right < 0 ? k : nums[right] + (k - (nums[right] - (right + 1)));

        return right < 0 ? k : k + right + 1;
    }

    public static void main(String[] args) {
        KthMissingPosNum solution = new KthMissingPosNum();

        // Test case 1
        int[] nums1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println("The " + k1 + "th missing positive number is: " + solution.findKthPositive(nums1, k1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println("The " + k2 + "th missing positive number is: " + solution.findKthPositive(nums2, k2));

        // Test case 3
        int[] nums3 = {5, 6, 7, 8, 9};
        int k3 = 1;
        System.out.println("The " + k3 + "th missing positive number is: " + solution.findKthPositive(nums3, k3));
    }
}
