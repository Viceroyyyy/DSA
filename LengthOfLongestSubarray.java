// import java.util.HashMap;

public class LengthOfLongestSubarray {
     public static int lenOfLongSubarr(int A[], int N, int K) {
        //Brute Force Includes running to Loops and considering all the Sub Arrays

        //--------------------------------------------------------------------------------------------------------------------------------


        //Better Solution involves a HashMap where we check that whether remaining i.e sum-K is present in  HashMap or not if it does then check maxLength between already present length and The current subarray's length i.e i-map.get(rem);
        //Then if the present sum is already not present then add the sum along with the index till there to the map as a new entry.

        //--------------------------------------------------------------------------------------------------------------------------------

        //Problem with this approach

        //Problem with this is approach is that in best Case it will take O(NlogN) time  but in the Worst case where the hashMap will have Multiple Collisions then this approach will take an O(N^2) time.
        //Note:- This approach is not optimal for Only Positive but for BOTH POSITIVE AND NEGATIVE ELEMENTS THIS IS THE OPTIMAL APPROACH
        //--------------------------------------------------------------------------------------------------------------------------------
        
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int maxLen = 0;
        // int sum = 0;
        
        // for(int i=0;i<A.length;i++){
        //     sum += A[i];
            
        //     if(sum==K){
        //         maxLen = Math.max(maxLen,i+1);
        //     }
            
        //     int rem = sum-K;
            
        //     if(map.containsKey(rem)){
        //         maxLen = Math.max(maxLen,i-map.get(rem));
        //     }
            
        //     if(!map.containsKey(sum)){
        //         map.put(sum,i);
        //     }
            
        // }
        // return maxLen;

        //------------------------------------------------------------------------------------------------------------------------------

        //Optimal Solution includes Sliding Window approach where we use two pointers but this APPROACH IS ONLY FOR POSITIVE NUMBERS NOT NEGATIVE NUMBERS 

        //Time Complexity for this solution will be O(2N) and space Complexity would be O(1) since no extra space is taken.
        int left=0,right=0;
        int maxLen = 0;
        int sum = A[0];
        while(right<N){
            while(left<=right && sum>K){
                sum -= A[left];
                left++;
            }

            if(sum == K){
                maxLen = Math.max(maxLen,right-left+1);
            }

            right++;
            if(right<N){
                sum += A[right];
            }
        }

        return maxLen;


    }
    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};
        int N = A.length;
        int K = 15;

        int result = lenOfLongSubarr(A, N, K);
        System.out.println("Length of the longest subarray: " + result);
    }
}
