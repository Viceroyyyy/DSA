import java.util.*;

public class sortMatrixElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element at "+i+" index:");
            arr[i]= sc.nextInt();
        }

        int even_len=0,odd_len=0;

        if(n%2==0){
            even_len=n/2;
            odd_len=n/2;
        }else{
            even_len=n/2+1;
            odd_len=n/2;
        }
        int[] even_arr = new int[even_len];
        int[] odd_arr = new int[odd_len];

        int even_indx = 0,odd_indx = 0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                even_arr[even_indx] = arr[i];
                even_indx++;
            }else{
                odd_arr[odd_indx] = arr[i];
                odd_indx++;
            }
        }

        Arrays.sort(even_arr);
        Arrays.sort(odd_arr);

        System.out.println("Sum of second largest elements of both even and the odd arrays are:"+(even_arr[even_arr.length-2]+odd_arr[odd_arr.length-2]));



        sc.close();
    }
}
