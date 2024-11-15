import java.util.ArrayList;
import java.util.Arrays;

public class KthElementOfTwoSortedArrays {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
    
    if(n>m) return kthElement(arr2,arr1,m,n,k);
    
    // int left = 0,right = n;
    int left = Math.max(0, k - m), right = Math.min(k, n);

    
    while(left<=right){
        int mid1 = (left+right)/2;
        int mid2 = k-mid1;
        
        int l1 = Integer.MIN_VALUE,l2 = Integer.MIN_VALUE;
        int r1 = Integer.MAX_VALUE,r2 = Integer.MAX_VALUE;
        
        
        
        if(mid1<n) 
        r1 = arr1.get(mid1);
        if(mid2<m)
        r2 = arr2.get(mid2);
        
        if(mid1-1>=0)
        l1 = arr1.get(mid1-1);
        if(mid2-1>=0)
        l2 = arr2.get(mid2-1);
        
        
        if(l1<=r2 && l2<=r1)
        {   return Math.max(l1,l2);
        }
        else if(l2>r1)
        left = mid1 + 1;
        else
        right = mid1 -1;
    } 
    
    return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 3, 6, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 4, 8, 10));
        int n = arr1.size();
        int m = arr2.size();
        int k = 5; // Change this value to test other k-th elements

        int result = kthElement(arr1, arr2, n, m, k);
        System.out.println("The " + k + "-th element in the two sorted arrays is: " + result);
    }
}
