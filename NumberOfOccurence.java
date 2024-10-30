public class NumberOfOccurence {
    int count(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int start = -1;
         int end = -1;
        while(left <= right){
            int mid = (left + right)/2;

            if(target == arr[mid]){
                end = mid;
                left = mid + 1;
            }else if(target > arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        // int start = 0;
        // arr[1] = index;
        left = 0;
        right = arr.length-1;
       

        while(left <= right){
            int mid = (left + right)/2;

            if(target == arr[mid]){
                start = mid;
                right = mid - 1;
            }else if(target > arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        if(start==-1){
            return 0;
        }else{
            return (end-start)+1;
        }
    }

    public static void main(String[] args) {
        NumberOfOccurence obj = new NumberOfOccurence();

        int[] arr = {1, 2, 2, 2, 3, 4, 5}; // Sample array
        int target = 2; // Target to search

        int result = obj.count(arr, target);
        System.out.println("Number of occurrences of " + target + " is: " + result);
    }
}
