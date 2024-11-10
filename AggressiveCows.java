import java.util.Arrays;

public class AggressiveCows {
    public static boolean canWePlace(int[] nums,int k,int mid){
        int count = 1;
        int lastPlacement = nums[0];
        for(int i=1;i<nums.length;i++){
            int minDiff = nums[i]-lastPlacement;
            
            if(minDiff>=mid)
            {
                count++;
                lastPlacement = nums[i];
            }
            
            if(count==k)
            return true;
        }
        
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
            Arrays.sort(stalls);
            int left = 1,right = stalls[stalls.length-1]-stalls[0];
            
            while(left<=right){
                int mid = (left+right)/2;
                
                if(!canWePlace(stalls,k,mid)){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            
            return right;

        }

        public static void main(String[] args) {
            AggressiveCows solution = new AggressiveCows();
    
            // Test case 1
            int[] stalls1 = {1, 2, 4, 8, 9};
            int k1 = 3;
            System.out.println("Largest minimum distance for " + k1 + " cows: " + solution.aggressiveCows(stalls1, k1));
    
            // Test case 2
            int[] stalls2 = {1, 2, 8, 4, 9};
            int k2 = 3;
            System.out.println("Largest minimum distance for " + k2 + " cows: " + solution.aggressiveCows(stalls2, k2));
    
            // Test case 3
            int[] stalls3 = {1, 3, 5, 9, 12};
            int k3 = 4;
            System.out.println("Largest minimum distance for " + k3 + " cows: " + solution.aggressiveCows(stalls3, k3));
        }
}
