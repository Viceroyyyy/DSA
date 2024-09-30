import java.util.*;

public class autobiographicalNumber {
    public static int FindAutoCount(String str){
        int zero_count = str.charAt(0)-'0';
        int one_count = str.charAt(1)-'0';

        int z_cnt = 0,o_cnt = 0;

        Set<Integer> sc = new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
            z_cnt++;
            else if (str.charAt(i)=='1')
            o_cnt++;

            sc.add((int)str.charAt(i));
        }

        if(z_cnt==zero_count && o_cnt==one_count)
        {
            return sc.size();
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();

        int result = FindAutoCount(input);

        if (result != 0) {
            System.out.println("The given number is autobiographical, and the count of unique digits is: " + result);
        } else {
            System.out.println("The given number is not autobiographical.");
        }

        scanner.close();
    }
}
