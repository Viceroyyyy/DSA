// package Accenture;

public class findCount {
    public static int getCount(int arr[], int length, int num, int diff){
        int count = 0;
        for(int i=0; i<length; i++){
            if(Math.abs(arr[i]-num)<=diff)
            count++;
        }
        if(count>0)
        return count;
        else
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};  // Sample array
        int length = arr.length;
        int num = 13;                   // Example target number
        int diff = 2;                  // Example difference value

        int result = getCount(arr, length, num, diff);

        if (result != -1) {
            System.out.println("Count of elements within the difference: " + result);
        } else {
            System.out.println("No elements found within the specified difference.");
        }
    }
}
