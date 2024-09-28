// package Accenture;

public class largeSmallSum {
    public static int calculateLargeSmallSum(int arr[]){
       int secondLar = Integer.MIN_VALUE,largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>largest ){
                    secondLar = largest;
                    largest = arr[i];
                }else if(arr[i]>secondLar)
                secondLar = arr[i];
            }else{
                if(arr[i]<smallest){
                    secondSmall = smallest;
                    smallest = arr[i];
                }else if(arr[i]<secondSmall)
                secondSmall = arr[i];
            }
        }
        return secondSmall+secondLar;
    }
    public static void main(String[] args) {
        // int[] arr = {3,2,1,7,5,4};
        int[] arr = {1,8,0,2,3,5,6};
        int result = calculateLargeSmallSum(arr);
        System.out.println("The sum of the second largest even-indexed and second smallest odd-indexed elements is: " + result);
    }
}
