public class MinNumDaysToMakeMBouquets {
    public static boolean possible(int[] nums,int m,int k,int div){
        int count = 0;
        int  noofB = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=div){
                count++;
            }else{
                noofB += (count/k);
                count = 0;
            }
        }
        noofB += (count/k);

        return noofB>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        //My BRUTE FORCE APPROACH 
        //Takes O(N^2) Time and O(N) Space

        if((long)m*k > bloomDay.length)
        return -1;

        // int[] nums = new int[bloomDay.length];

        // nums = Arrays.copyOf(bloomDay,bloomDay.length);

        // Arrays.sort(nums);
        // int min_days = 0;
        // for(int i=nums.length-1;i>=0;i--){
        //     int cnt = 0,count = 0;
        //     for(int j=0;j<bloomDay.length;j++){
        //         if(bloomDay[j]<=nums[i]){
        //             count++;
        //         }else{
        //             count = 0;
        //         }

        //         if(count==k){
        //             cnt++;
        //             count = 0;
        //         }
        //     }

        //     if(cnt>=m){
        //         min_days = nums[i];
        //     }
        // }
        // return min_days;

        //Better Solution (Strivers BRUTE FORCE APPROACH)
        //TAkes O((max-min+1)N) time and O(1) Space
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // for(int i=0;i<bloomDay.length;i++){
        //     max = Math.max(max,bloomDay[i]);
        //     min = Math.min(min,bloomDay[i]);
        // }

        // for(int i = min;i<=max;i++){
        //     if(possible(bloomDay,m,k,i))
        //     return i;
        // }

        // return -1;


        //OPTIMAL SOLUTION 
        //Takes O(N*(log(max-min+1))) time and O(1) Space
        

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            max = Math.max(max,bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }

        while(min<=max){
            int mid = min+(max-min)/2;

            if(possible(bloomDay,m,k,mid)){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }

        return min;

    }

    public static void main(String[] args) {
        MinNumDaysToMakeMBouquets obj = new MinNumDaysToMakeMBouquets();
        
        // Test case 1
        int[] bloomDay1 = {1, 10, 3, 10, 2};
        int m1 = 3;
        int k1 = 1;
        System.out.println("Minimum days for test case 1: " + obj.minDays(bloomDay1, m1, k1)); // Expected output: 3

        // Test case 2
        int[] bloomDay2 = {7, 7, 7, 7, 12, 7, 7};
        int m2 = 2;
        int k2 = 3;
        System.out.println("Minimum days for test case 2: " + obj.minDays(bloomDay2, m2, k2)); // Expected output: 12

        // Test case 3
        int[] bloomDay3 = {1000000000, 1000000000};
        int m3 = 1;
        int k3 = 1;
        System.out.println("Minimum days for test case 3: " + obj.minDays(bloomDay3, m3, k3)); // Expected output: 1000000000

        // Test case 4
        int[] bloomDay4 = {1, 10, 3, 10, 2};
        int m4 = 3;
        int k4 = 2;
        System.out.println("Minimum days for test case 4: " + obj.minDays(bloomDay4, m4, k4)); // Expected output: -1 (not enough flowers)

        // Test case 5 (edge case)
        int[] bloomDay5 = {1};
        int m5 = 1;
        int k5 = 1;
        System.out.println("Minimum days for test case 5: " + obj.minDays(bloomDay5, m5, k5)); // Expected output: 1
    }
}
