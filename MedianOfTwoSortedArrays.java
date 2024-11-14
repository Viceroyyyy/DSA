public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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

    int arrlen = nums1.length+nums2.length;
        
        int medind = arrlen/2;
    
    int i=0,j=0;
    int index = 0,sum=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){

                if(arrlen%2==0){
                    if(index==medind-1){
                    sum+=nums1[i];
                }else if(index==medind){
                    sum+=nums1[i];
                    return sum/2.0;
                }
                }else{
                    if(index==medind){
                        return nums1[i];
                    }
                }
                
                index++;
                i++;
            }else{
                // arr[index] = nums2[j];

                if(arrlen%2==0){
                    if(index==medind-1){
                    sum+=nums2[j];
                }else if(index==medind){
                    sum+=nums2[j];
                    return sum/2.0;
                }
                }else{
                    if(index==medind){
                        return nums2[j];
                    }
                }
                index++;
                j++;

            }
        }

        while(i<nums1.length){
            // arr[index] = nums1[i];

            if(arrlen%2==0){
                    if(index==medind-1){
                    sum+=nums1[i];
                }else if(index==medind){
                    sum+=nums1[i];
                    return sum/2.0;
                }
                }else{
                    if(index==medind){
                        return nums1[i];
                    }
                }
            i++;
            index++;
        }

        while(j<nums2.length){
            // arr[index] = nums2[j];

            if(arrlen%2==0){
                    if(index==medind-1){
                    sum+=nums2[j];
                }else if(index==medind){
                    sum+=nums2[j];
                    return sum/2.0;
                }
                }else{
                    if(index==medind){
                        return nums2[j];
                    }
                }
            j++;
            index++;
        }

    // if(arrlen%2==0){
    //     return (arr[arrlen/2]+arr[arrlen/2-1])/2.0;
    // }

    // return arr[arrlen/2];
    // }
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
