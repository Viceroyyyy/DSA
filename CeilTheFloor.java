import java.util.Arrays;

public class CeilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr) {
        
        int[] nums = new int[2];
        // code here
        int floor=0;
        int ceil = 0;
        Arrays.sort(arr);
        if(arr[0]>x)
        nums[0] = -1;
        else if(x>arr[arr.length-1]){
            nums[1] = -1;
        }
        
        int left = 0;
        int right = arr.length-1;
        
        int index = 0;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(x==arr[mid]){
                nums[0] = x;
                nums[1] = x;
                return nums;
            }else if(x>arr[mid]){
                left = mid+1;
                nums[0] = arr[mid];
            }else{
                right = mid-1;
                nums[1] = arr[mid];
            }
        }
        
        return nums;
    }

    public static void main(String[] args) {
        CeilTheFloor ctf = new CeilTheFloor();
        
        int[] arr = {2, 8, 3, 6, 10, 15};
        int x = 5;

        int[] result = ctf.getFloorAndCeil(x, arr);

        System.out.println("Floor of " + x + ": " + (result[0] != -1 ? result[0] : "No Floor"));
        System.out.println("Ceil of " + x + ": " + (result[1] != -1 ? result[1] : "No Ceil"));
    }

}
