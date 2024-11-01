public class SearchInRotatedSortedArray{
    public int search(int[] nums, int target) {
        //Plan Of Action - Find the index of numbers which are following the pattern (greater then the consecutive one is smaller) then apply Binary Search Two Times. TC O(2logn) = O(logn)
        // int result = 0;
        // if(nums.length>2){
        //     for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         result = binsearch(nums,0,i,target);
        //        if(result==-1){
        //         result = binsearch(nums,i+1,nums.length-1,target);
        //        }   
        //        return result;
        //     }

        // }
        // result  = binsearch(nums,0,nums.length-1,target);
        // return result;
        // }else if(nums.length==2){
        //     if(nums[0]==target)
        //     return 0;
        //     else if(nums[1]==target)
        //     return 1;
        //     else{
        //         return -1;
        //     }
        // }else{
        //     if(nums[0]==target)
        //     return 0;
        //     else
        //     return -1;
        // }
        int left  = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left + right)/2;

            if(target == nums[mid]){
                return mid;
            }else if(nums[left] <= nums[mid]){
                if(nums[left]<=target && target<=nums[mid])
                right = mid-1;
                else
                left = mid+1;
            }else{
                if(nums[mid]<=target && target<=nums[right])
                left = mid+1;
                else
                right = mid-1;
            } 
        }

        return -1;
        
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInstance = new SearchInRotatedSortedArray();
        
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = searchInstance.search(nums, target);
        
        System.out.println("Index of target " + target + " is: " + result);
        
        // Additional test cases
        target = 3;
        result = searchInstance.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
        
        nums = new int[]{1};
        target = 1;
        result = searchInstance.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
        
        target = 2;
        result = searchInstance.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
    }
}