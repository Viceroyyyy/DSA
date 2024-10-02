import java.util.*;

public class uniqueChar {
    public static void main(String[] args){

        Scanner sc =new Scanner (System.in);

        System.out.print("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String str2 = sc.nextLine();

        Set<Character> set = new HashSet<Character>();

        for(int i=0; i<str1.length(); i++){
            set.add(str1.charAt(i));
        }
        for(int i=0; i<str2.length(); i++){
            set.add(str2.charAt(i));
        }

        System.out.println(set.size());


        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the total subjects: ");
        int P = sc.nextInt(); 

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Enter the 1st Sem Marks: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the 2nd Sem Marks: ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr1[i] = arr2[i]-arr1[i];
        }
        Arrays.sort(arr1);
        int sum = 0;
        for(int i=n-1;i>=n-P;i--){
            sum+=arr1[i];
        }
        if(sum>=35)
        System.out.println("Qualified " +sum);
        else
        System.out.println("Disqualified " +sum);

        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
        sc.close();
    }
}
