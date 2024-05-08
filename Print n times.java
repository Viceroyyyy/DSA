import java.util.*;
public class Solution {
    public static void recur(int x,List<String> str){
        if(x==0)
        return;
        str.add("Coding Ninjas");
        recur(x-1,str);
    }
    public static List<String> printNtimes(int n){
        List<String> str= new ArrayList<>();
        recur(n,str);
        return str;
        }
    }
