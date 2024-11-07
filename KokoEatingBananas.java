public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        //BRUTE FORCE Gives TLE
    //     int max = 0;
    //    for(int i = 0;i<piles.length;i++){
    //     max = Math.max(piles[i],max);
    //    }

    //    int k = 1;
    //    while(k<=max){
    //     int sum = 0;
    //     for(int i=0;i<piles.length;i++){
    //         sum += Math.ceil((double)piles[i]/(double)k);
    //     }

    //     if(sum<=h)
    //     return k;
    //     else{
    //         k++;
    //     }

    //    }

    //    return -1;
    // }

    //Optimal Approach

     int max = 0;
       for(int i = 0;i<piles.length;i++){
        max = Math.max(piles[i],max);
       }

       int k = 1;
       while(k<=max){ 
        int mid = (k+max)/2;

        int sum = 0;
        for(int i=0;i<piles.length;i++){
            sum += Math.ceil((double)piles[i]/(double)mid);
        }
        if(sum<=h){
            max = mid-1;
        }else{
            k = mid+1;
        }
       }
        return k;
    }

    public static void main(String[] args) {
        KokoEatingBananas koko = new KokoEatingBananas();

        int[] piles = {3, 6, 7, 11}; // example input
        int h = 8; // example hours

        int minSpeed = koko.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed to finish within " + h + " hours is: " + minSpeed);
    }
}
