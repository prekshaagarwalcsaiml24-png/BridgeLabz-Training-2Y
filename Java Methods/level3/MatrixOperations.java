import java.util.Random;
public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of matrices:");
        printMatrix(sum);
        int[][] diff = subtractMatrices(matrixA, matrixB);
        System.out.println("Difference of matrices:");
        printMatrix(diff);
        int[][] matrixC = createRandomMatrix(cols, rows);
        System.out.println("Matrix C (for multiplication):");
        printMatrix(matrixC);
        int[][] product = multiplyMatrices(matrixA, matrixC);
        System.out.println("Product of matrices A and C:");
        printMatrix(product);
    }
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A columns must equal Matrix B rows for multiplication.");
        }
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
