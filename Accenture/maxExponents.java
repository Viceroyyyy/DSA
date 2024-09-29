
public class maxExponents {
    public static int MaxExponents(int a,int b){
        int max_count = Integer.MIN_VALUE;
        int num=0;
        for(int i=a;i<=b;i++){
            int count = 0;
            int temp = i;
            while(temp%2 == 0 && temp!=0){
                count++;
                temp/=2;
            }
            if(count>max_count){
                max_count = count;
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int a = 7; // starting range
        int b = 12; // ending range
        
        int result = MaxExponents(a, b);
        System.out.println("The number between " + a + " and " + b + " with the maximum number of times divisible by 2 is: " + result);
    }
}
