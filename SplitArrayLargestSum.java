public class SplitArrayLargestSum {
    public static boolean splitPossible(int[] nums,int k,int mid){

        int sum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum==mid){
                count++;
                sum = 0;
            }else if(sum>mid){
                count++;
                sum = nums[i];
            }
        }

        if(sum>0)
        count++;

        return count<=k;

    }
    public int splitArray(int[] nums, int k) {
        if(nums.length<k)
        return -1;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum += nums[i];
        }

        int left = max,right =  sum;

        while(left<=right){
            int mid = (left+right)/2;

            if(splitPossible(nums,k,mid)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2; // Number of subarrays

        SplitArrayLargestSum solution = new SplitArrayLargestSum();
        int result = solution.splitArray(nums, k);

        if (result != -1) {
            System.out.println("Minimum largest sum after splitting: " + result);
        } else {
            System.out.println("Not possible to split array into " + k + " parts.");
        }
    }
}
