import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
        }
        
        // for(int i = 0,j=list.size()-1;i<j;i++,j--){
        //     int temp = list.get(i);
        //     list.add(i,list.get(j));
        //     list.add(j,temp);
        // }
        
        Collections.reverse(list);
        
        return list;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {16, 17, 4, 3, 5, 2};

        // Calling the leaders method and storing the result
        ArrayList<Integer> result = leaders(arr);

        // Printing the result
        System.out.println("Leaders in the array: " + result);
    }
}
