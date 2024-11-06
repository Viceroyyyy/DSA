public class PeakElement {
    public int findPeakElement(int[] nums){
        if(nums.length == 0) return 0 ;

        int left = 0 , right = nums.length - 1 ;

        while(left<=right){
            int mid = (left + right)/2;

            if((mid==0 || nums[mid]>nums[mid-1])&&(mid==nums.length-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();

        int[] nums = {1, 2, 3, 1};
        int peakIndex = peakElement.findPeakElement(nums);

        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex);
            System.out.println("Peak element value: " + nums[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
