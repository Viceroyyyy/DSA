public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid]){
                left= mid+1;

            }else{

                right = mid-1;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int result = bs.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}

