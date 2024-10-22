import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr = new ArrayList<>();
        if(numRows>1){
            List<Integer> nums1 = new ArrayList<>();
                nums1.add(1);
                arr.add(nums1);
                
            int index = 0;
            for(int i=1;i<numRows;i++){
                List<Integer> nums = new ArrayList<>();
                nums.add(1);
                int start = 0;
                int end = arr.get(index).size();
                while(start<end-1){
                    int sum = arr.get(index).get(start)+arr.get(index).get(start+1);
                    start++;
                    nums.add(sum);
                }
                nums.add(1);
                arr.add(nums);
                index++;
            }
            return arr;
        }else{
            List<Integer> nums1 = new ArrayList<>();
                nums1.add(1);
                arr.add(nums1);
            return arr;
        }
        
    }
    public static void main(String[] args) {
    PascalTriangle pascalTriangle = new PascalTriangle();

    // Example input
    int numRows = 5;

    // Generate Pascal's Triangle with the given number of rows
    List<List<Integer>> result = pascalTriangle.generate(numRows);

    // Print the result
    System.out.println("Pascal's Triangle:");
    for (List<Integer> row : result) {
        System.out.println(row);
    }
}

}
