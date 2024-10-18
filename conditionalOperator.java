public class conditionalOperator {
    public static String compareIfElse(int a, int b) {
        if(a>b)
        return "greater";
        // System.out.println("greater");
        else if(a<b)
        return "smaller";
        // System.out.println("smaller");
        else
        return "equal";
        //System.out.println("equal");

        


    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Test the compareIfElse method
        String result = compareIfElse(num1, num2);
        System.out.println("Comparison Result: " + result);

        // Additional test cases
        System.out.println("Test 1: " + compareIfElse(15, 10)); // greater
        System.out.println("Test 2: " + compareIfElse(5, 8));   // smaller
        System.out.println("Test 3: " + compareIfElse(7, 7));   // equal
    }
}