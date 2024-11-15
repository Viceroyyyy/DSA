public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
          //BRUTE FORCE
    // int arrlen = nums1.length+nums2.length;
    //     int[] arr = new int[arrlen];
    //     int medind = arrlen/2;
    
    // int i=0,j=0;
    // int index = 0;
    //     while(i<nums1.length && j<nums2.length){
    //         if(nums1[i]<=nums2[j]){
    //             arr[index] = nums1[i];
    //             index++;
    //             i++;
    //         }else{
    //             arr[index] = nums2[j];
    //             index++;
    //             j++;

    //         }
    //     }

    //     while(i<nums1.length){
    //         arr[index] = nums1[i];
    //         i++;
    //         index++;
    //     }

    //     while(j<nums2.length){
    //         arr[index] = nums2[j];
    //         j++;
    //         index++;
    //     }

    // if(arrlen%2==0){
    //     return (arr[arrlen/2]+arr[arrlen/2-1])/2.0;
    // }

    // return arr[arrlen/2];

    //BETTER APPROACH

    // int arrlen = nums1.length+nums2.length;
        
    //     int medind = arrlen/2;
    
    // int i=0,j=0;
    // int index = 0,sum=0;
    //     while(i<nums1.length && j<nums2.length){
    //         if(nums1[i]<=nums2[j]){

    //             if(arrlen%2==0){
    //                 if(index==medind-1){
    //                 sum+=nums1[i];
    //             }else if(index==medind){
    //                 sum+=nums1[i];
    //                 return sum/2.0;
    //             }
    //             }else{
    //                 if(index==medind){
    //                     return nums1[i];
    //                 }
    //             }
                
    //             index++;
    //             i++;
    //         }else{
    //             // arr[index] = nums2[j];

    //             if(arrlen%2==0){
    //                 if(index==medind-1){
    //                 sum+=nums2[j];
    //             }else if(index==medind){
    //                 sum+=nums2[j];
    //                 return sum/2.0;
    //             }
    //             }else{
    //                 if(index==medind){
    //                     return nums2[j];
    //                 }
    //             }
    //             index++;
    //             j++;

    //         }
    //     }

    //     while(i<nums1.length){
    //         if(arrlen%2==0){
    //                 if(index==medind-1){
    //                 sum+=nums1[i];
    //             }else if(index==medind){
    //                 sum+=nums1[i];
    //                 return sum/2.0;
    //             }
    //             }else{
    //                 if(index==medind){
    //                     return nums1[i];
    //                 }
    //             }
    //         i++;
    //         index++;
    //     }

    //     while(j<nums2.length){

    //         if(arrlen%2==0){
    //                 if(index==medind-1){
    //                 sum+=nums2[j];
    //             }else if(index==medind){
    //                 sum+=nums2[j];
    //                 return sum/2.0;
    //             }
    //             }else{
    //                 if(index==medind){
    //                     return nums2[j];
    //                 }
    //             }
    //         j++;
    //         index++;
    //     }
    // return 0;

    //OPTIMAL APPROACH

    int n1 = arr1.length;
    int n2 = arr2.length;
    
    if(n1>n2) return findMedianSortedArrays(arr2,arr1);
    
    int left = 0,right = n1;
    int total = (n1+n2+1)/2;
    int arrlen = n1+n2;
    while(left<=right){
        int mid1 = (left+right)/2;
        int mid2 = total-mid1;
        
        int l1 = Integer.MIN_VALUE,l2 = Integer.MIN_VALUE;
        int r1 = Integer.MAX_VALUE,r2 = Integer.MAX_VALUE;
        
        
        
        if(mid1<n1) 
        r1 = arr1[mid1];
        if(mid2<n2)
        r2 = arr2[mid2];
        
        if(mid1-1>=0)
        l1 = arr1[mid1-1];
        if(mid2-1>=0)
        l2 = arr2[mid2-1];
        
        
        if(l1<=r2 && l2<=r1)
        {if(arrlen%2==1) return Math.max(l1,l2);
            return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
        }
        else if(l2>r1)
        left = mid1 + 1;
        else
        right = mid1 -1;
    }
    return 0;
    }
    public static void main(String[] args) {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of arrays {1, 3} and {2} is: " + median);
        
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        
        median = solution.findMedianSortedArrays(nums3, nums4);
        System.out.println("Median of arrays {1, 2} and {3, 4} is: " + median);

        int[] nums5 = {};
        int[] nums6 = {1};
        
        median = solution.findMedianSortedArrays(nums5, nums6);
        System.out.println("Median of arrays {} and {1} is: " + median);

        int[] nums7 = {0, 0};
        int[] nums8 = {0, 0};
        
        median = solution.findMedianSortedArrays(nums7, nums8);
        System.out.println("Median of arrays {0, 0} and {0, 0} is: " + median);
    }
}
