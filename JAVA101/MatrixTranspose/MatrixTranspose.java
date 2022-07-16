public class MatrixTranspose {
    
    public static int [][] transposeMatrix(int [][]matrix){

        int [][] transpose = new int[matrix[0].length][matrix.length]; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    
    public static void printMatrix(int [][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    
        int [][] matrix = {{2, 3, 4}, {5, 6, 4}};
        System.out.println("Matris");
        printMatrix(matrix);
        System.out.println("Transpose");
        printMatrix(transposeMatrix(matrix));
        
    }

    
    
        

    
}
