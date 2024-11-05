public class SqrtUsingBS {
    long floorSqrt(long n) {
        // Your code here
        
        long left = 1,right = n;
        long floor = 0;
        while(left<=right){
            long mid = (left+right)/2;
            
            if(Math.pow(mid,2)==n)
                return mid;
            else if(Math.pow(mid,2)>n)
               { right = mid-1;
               }
            else
               { left = mid+1;
                   floor = mid;
               }
        }
        
        return floor;
    }

    public static void main(String[] args) {
        SqrtUsingBS sqrtFinder = new SqrtUsingBS();
        
        long[] testCases = {0, 1, 2, 4, 9, 10, 16, 17, 25, 26, 100, 2147395599}; // Test cases

        for (long n : testCases) {
            long result = sqrtFinder.floorSqrt(n);
            System.out.println("The floor square root of " + n + " is: " + result);
        }
    }
}
