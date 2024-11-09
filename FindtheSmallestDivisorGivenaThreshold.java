public class FindtheSmallestDivisorGivenaThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        // int max = Integer.MIN_VALUE;
        // for(int i: nums) max = Math.max(max,i);

        int left = 1,right = 1000000;

        while(left<=right){
            int mid = (left+right)/2;
            int sum = 0;
            for(int i: nums) sum += Math.ceil((double)i/(double)mid);

            if(sum<=threshold){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        FindtheSmallestDivisorGivenaThreshold solver = new FindtheSmallestDivisorGivenaThreshold();

        int[] nums = {1, 2, 5, 9}; // example input
        int threshold = 6; // example threshold

        int smallestDivisor = solver.smallestDivisor(nums, threshold);
        System.out.println("The smallest divisor to keep the sum under the threshold is: " + smallestDivisor);
    }
}
