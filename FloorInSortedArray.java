public class FloorInSortedArray {
    static int findFloor(long arr[], int n, long x) {
        if(arr[0]>x)
        return -1;
        
        int left = 0;
        int right = n-1;
        long max = Long.MIN_VALUE;
        int index = 0;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(x==arr[mid]){
                return mid;
            }else if(x>arr[mid]){
                left = mid+1;
                index = mid;
            }else{
                right = mid-1;
            }
        }
        
        return index;
        
        // return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 4, 6, 10, 12, 14};
        long x = 7;

        int n = arr.length;
        int floorIndex = findFloor(arr, n, x);

        if (floorIndex != -1) {
            System.out.println("Floor of " + x + " is: " + arr[floorIndex] + " at index " + floorIndex);
        } else {
            System.out.println("No floor found for " + x);
        }
    }
}
