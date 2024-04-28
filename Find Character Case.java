import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        // InputStreamReader a= new InputStreamReader(System.in);
        // BufferedReader b= new BufferedReader(a);

        //input=b.readLine();
        Scanner a = new Scanner(System.in);
        // String b=a.nextLine();
        char b = a.next().charAt(0);
        

        if(b>='A' && b<='Z')
        System.out.println("1");
        else if(b>='a' && b<='z')
        System.out.println("0");
        else
        System.out.println("-1");
        a.close();

    }
}