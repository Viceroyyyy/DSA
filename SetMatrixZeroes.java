import java.util.Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        //Brute Force - 
        /*
         * Iterate over the matrix and search for zeroes.
         * If a zero is found then convert the corresponding row and column into -1 or any other value.
         * After the iteration is complete iterate again and rewrite the -1 values to zero.
         */

         //Better Approach:-
         /*
          * Take two arrays one according to the length og matrix row and one according to the length of the matrix column 
          If a zero is found set the corresponding row matrix and colum matrix index to 1 
          Then check For entire iteration whether row[i] and column[j] value is 1 or not if it is one then set the corresponding value to 0
          */
          //Time Complexity O(2(mxn)) Space Complexity - O(m+n)

          int[] row = new int[matrix.length];
          int[] col = new int[matrix[0].length];

          for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <matrix[0].length; j++){
                if(matrix[i][j]==0)
                {
                    row[i] = 1;
                    col[j] = 1;
                 }
            }
          }

          for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <matrix[0].length; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
          }


    }
    public static void main(String[] args) {
        SetMatrixZeroes obj = new SetMatrixZeroes();

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix.
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
