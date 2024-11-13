public class MinMaxDistToGasStation {
    public static boolean possible(int[] stations,int k,double mid){
        int count = 0;
        for(int i=0;i<stations.length-1;i++){
           count += (int)((stations[i + 1] - stations[i]) / mid);
        }
        
        return count<=k;
    }
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        
        for(int i = 0;i<stations.length-1;i++){
            // min = Math.min(min,stations[i+1]-stations[i]);
            max = Math.max(max,stations[i+1]-stations[i]);
        }
        
        // double left = min;
        double left = 0;
        double right = max;
        
        while(right-left>Math.pow(10,-6)){
            double mid = (left+right)/2.0;
            
            if(possible(stations,k,mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        
        return right;
    }
    public static void main(String[] args) {
        int[] stations = {1, 2, 7, 10};
        int k = 2; // Number of additional gas stations

        double smallestMaxDist = MinMaxDistToGasStation.findSmallestMaxDist(stations, k);
        System.out.println("The smallest maximum distance is: " + smallestMaxDist);
    }
}
