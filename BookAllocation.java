public class BookAllocation {
    public static boolean allocationPossible(int[] nums,int k,int mid){
        
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
        
        return count <= k;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        
        if(arr.length<k)
        return -1;
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            sum += arr[i];
        }
        
        int left = max,right = sum;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(allocationPossible(arr,k,mid))
            right = mid-1;
            else
            left = mid +1;
            
        }
        
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2; // Number of students
        
        int result = BookAllocation.findPages(arr, k);
        
        if (result != -1) {
            System.out.println("Minimum number of pages allocated: " + result);
        } else {
            System.out.println("Not possible to allocate books to all students.");
        }
    }
}
