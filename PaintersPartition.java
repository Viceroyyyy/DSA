import java.util.ArrayList;
import java.util.Arrays;

public class PaintersPartition {
    public static boolean partitionPossible(ArrayList<Integer> boards,int k,int mid){
        int sum = 0;
        int count = 0;
        for(int element: boards){
            sum += element;

            if(sum==mid){
                count++;
                sum = 0;
            }else if(sum>mid){
                count++;
                sum = element;
            }
        }

        if(sum>0)
        count++;

        return count<=k;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int element: boards){
            max = Math.max(max,element);
            sum += element;
        }

        int left = max;
        int right = sum;

        while(left<=right){
            int mid = (left+right)/2;

            if(partitionPossible(boards,k,mid)){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int k = 2; // Number of painters

        int largestMinDistance = PaintersPartition.findLargestMinDistance(boards, k);
        System.out.println("The largest minimum distance is: " + largestMinDistance);
    }
}
