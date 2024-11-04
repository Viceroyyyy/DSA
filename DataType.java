import java.util.Scanner;

public class DataType {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a data type (Integer, Long, Float, Double, Character): ");
        String type = scanner.nextLine();

        int size = DataType.dataTypes(type);
        
        if (size == -1) {
            System.out.println("Invalid data type.");
        } else {
            System.out.println("Size of " + type + " is: " + size + " bytes.");
        }
        
        scanner.close();
    }
}