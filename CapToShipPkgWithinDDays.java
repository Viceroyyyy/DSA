public class CapToShipPkgWithinDDays {
    public static boolean possible(int[] nums,int days,int k){
        int sum =0,count =0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>=k){
                if(sum==k){
                    count++;
                    sum = 0;
                }else{
                    count++;
                    sum = nums[i];
                }
            }
        }

        if(sum<k && sum!=0){
            count++;
        }

        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            max = Math.max(max,weights[i]);
            sum+= weights[i];
        }
        int left = max; 
        int right = sum;
        
        while(left<=right){
            int mid = (left+right)/2;

            if(possible(weights,days,mid)){
                right = mid-1;
            }else{
                left= mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        CapToShipPkgWithinDDays solution = new CapToShipPkgWithinDDays();
        
        // Example test case
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        
        int result = solution.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity needed: " + result);
        
        // Additional test cases
        int[] weights2 = {3, 2, 2, 4, 1, 4};
        int days2 = 3;
        System.out.println("Minimum ship capacity needed: " + solution.shipWithinDays(weights2, days2));

        int[] weights3 = {1, 2, 3, 1, 1};
        int days3 = 4;
        System.out.println("Minimum ship capacity needed: " + solution.shipWithinDays(weights3, days3));
    }
}
