// package Accenture;

public class sumDiff {
    public static int differenceofSum(int n,int m){
        int not_div=0,div=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                div+=i;
        }
        else{
            not_div+=i;
        }
    }
    return Math.abs(not_div-div);
}
public static void main(String[] args) {
    int n = 4;  // Example value for n
    int m = 20; // Example value for m

    int result = differenceofSum(n, m);

    System.out.println("The absolute difference is: " + result);
}
}
