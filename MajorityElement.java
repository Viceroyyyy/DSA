public class MajorityElement {
    
        public int majorityElement(int[] nums) {
    
          //  Brute Force
            
        //    for(int i=0;i<nums.length;i++){
        //     int count = 0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //         if(count>Math.ceil(nums.length/2))
        //         return nums[i];
        //     }
        //    }
        //    return -1; 
    
        //Better Solution is using HashMap
    
        // HashMap<Integer,Integer> map = new HashMap<>();
    
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i]))
        //     {int currCount = map.get(nums[i]);
        //     map.put(nums[i],currCount+1);}
        // else{
        //     map.put(nums[i],1);
        // }
            
        // }
    
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>Math.ceil(nums.length/2))
        //     return entry.getKey();
        // }
        // return -1;
    
        //Best Solution uses Moore's Voting Algorithm and Uses Linear Time
        int element = 0, count = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element = nums[i];
                count = 1;
            }else if(nums[i]==element){
                count++;
            }else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                cnt++;
            }

            if(cnt>Math.ceil(nums.length/2))
            return element;
        }
        return -1;
        }
        public static void main(String[] args) {
            MajorityElement me = new MajorityElement();
    
            // Example 1
            int[] nums1 = {3, 3, 4, 2, 3, 3};
            System.out.println("Majority element in nums1: " + me.majorityElement(nums1));
    
            // Example 2
            int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
            System.out.println("Majority element in nums2: " + me.majorityElement(nums2));
    
            // Example 3 (no majority element case)
            int[] nums3 = {1, 2, 3};
            System.out.println("Majority element in nums3: " + me.majorityElement(nums3));
        }
}
