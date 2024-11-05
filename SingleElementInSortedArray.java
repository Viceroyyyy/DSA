public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left = 0,right = nums.length-1;
        int n = nums.length-1;
        if(nums.length==1)
        return nums[0];
        else
        while(left<=right){
            int mid = (left+right)/2;

            if((mid-1)>=0 && nums[mid]==nums[mid-1]){
                if(((mid-1)-0)%2!=0){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if((mid+1)<=nums.length-1 && nums[mid]==nums[mid+1]){
                if(((nums.length-1)-(mid+1))%2!=0){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }else{
                return nums[mid];
            }
        }

        return -1;
        
    }


    public static void main(String[] args) {
        SingleElementInSortedArray finder = new SingleElementInSortedArray();
        
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8}; // Example array with a unique element (2)
        
        int uniqueElement = finder.singleNonDuplicate(nums);
        System.out.println("The single non-duplicate element is: " + uniqueElement);
    }
}
