// package Accenture;

public class smallestPairProd {
    public static int ProductSmallestPair(int sum,int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        if(arr.length == 0 || arr.length <2)
        return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
                
            }else if(arr[i] < secondSmallest)
            secondSmallest = arr[i];
        }

        if(smallest + secondSmallest <= sum)
        return smallest*secondSmallest;
        else
        return 0;

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 5, 1};
        int sum = 10;
        int result = ProductSmallestPair(sum, arr);
        System.out.println("The product of the smallest pair with a sum less than or equal to " + sum + " is: " + result);
    }
}
