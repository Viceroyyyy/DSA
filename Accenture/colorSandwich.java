import java.util.*;

public class colorSandwich {
    public static String breadcolor(String str){
        // String result = "";
        Set<Character> set = new LinkedHashSet<Character>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    set.add(str.charAt(i));
                    i = j;
                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the string representing sandwiches:");
            String str = sc.nextLine();

            System.out.println("Different colors of breads are: "+breadcolor(str));
            sc.close();
    }
}
