public class RotateImage {
    public static void reverse(int[] matrix){
        int i =0,j=matrix.length-1;
        while(i<j){
            int temp = matrix[j];
            matrix[j] = matrix[i];
            matrix[i] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j = i+1; j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
            reverse(matrix[i]);
        }
    }
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateImage.rotate(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
