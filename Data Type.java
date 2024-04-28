import java.util.Scanner;

public class Solution {
    public static int dataTypes(String type) {
       
        switch(type)
        {
            case "Integer":
            // System.out.println("4");
            return 4;
            case "Long":
            // System.out.println("8"); 
            return 8;
            case "Float":
            return 4;            
            case "Double":
            return 8;
            case "Character":
            return 1;
            default:
            return -1;



         }

    }
}