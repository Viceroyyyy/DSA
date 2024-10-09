public class secondLargestElement {
    
        public int getSecondLargest(int[] arr) {
            int max=Integer.MIN_VALUE;
            int second_largest = Integer.MIN_VALUE;
            if(arr.length==1)
            return -1;
            for(int i=0;i<arr.length;i++)
            {
                if(max<arr[i])
                {
                    second_largest = max;
                    max = arr[i];
                }else if(arr[i]>second_largest && arr[i]<max){
                    second_largest = arr[i];
                }
            }
            
            if(second_largest!=Integer.MIN_VALUE)
            return second_largest;
            else 
            return -1;
        }
        public static void main(String[] args) {
            secondLargestElement obj = new secondLargestElement();
            
            // Example array
            int[] arr = {12, 35, 1, 10, 34, 1};
    
            // Get and print second largest element
            int result = obj.getSecondLargest(arr);
            if(result != -1) {
                System.out.println("The second largest element is: " + result);
            } else {
                System.out.println("There is no second largest element.");
            }
        }
}
