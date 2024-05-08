public class Solution {
    public static void recurs(int y,int i,int x,int arr[]){
        if(i>=x)
        return;
        arr[i]=y;
        recurs(y+1,i+1,x,arr);
    }
   
    public static int[] printNos(int x) {
         int arr[]=new int[x];
         recurs(1,0,x,arr);
         return arr;
    }
}