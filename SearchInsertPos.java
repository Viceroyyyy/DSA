import java.util.Scanner;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int x = target;
        int n = nums.length;
        if(nums[0]>x)
        return 0;
        
    
        int left = 0;
        int right = n-1;
        
        int index = 0;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(x==nums[mid]){
                return mid;
            }else if(x>nums[mid]){
                left = mid+1;
                index = mid;
            }else{
                right = mid-1;
            }
        }
        
        return index+1;
        
    
    }
    public static void main(String[] args) {
        SearchInsertPos obj = new SearchInsertPos();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int result = obj.searchInsert(nums, target);
        System.out.println("The target should be inserted at index: " + result);

        sc.close();
    }
}
