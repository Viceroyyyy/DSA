// package Accenture;

public class ratCount{
    
        public static int getRatCount(int r, int unit, int arr[]) {
            int foodReq = r * unit;
            if (arr.length == 0)
                return -1;
    
            // int count = 0;
            int sum = 0;
            int i;
            for (i = 0; i < arr.length; i++) {
                sum += arr[i];
                if(sum>=foodReq)
                break;
            }
            if(sum>=foodReq) 
            return i+1;
            else
            return 0;
        }
    
        public static void main(String[] args) {
            // Example values for r, unit, and the array
            int r = 5; // Number of rats
            int unit = 3; // Food units per rat
            int[] arr = {2, 3, 4, 1, 5}; // Food array
    
            // Call getRatCount and print the result
            int result = getRatCount(r, unit, arr);
            System.out.println("Number of food items used: " + result);
        }
    }

