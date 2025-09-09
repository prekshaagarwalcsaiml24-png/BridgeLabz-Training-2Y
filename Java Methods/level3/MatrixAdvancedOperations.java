import java.util.Random;
public class MatrixAdvancedOperations {
    public static void main(String[] args) {
        int size2x2 = 2;
        int size3x3 = 3;
        int[][] matrix2x2 = createRandomMatrix(size2x2, size2x2);
        int[][] matrix3x3 = createRandomMatrix(size3x3, size3x3);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Transpose of 2x2 Matrix:");
        displayMatrix(transposeMatrix(matrix2x2));
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));
        System.out.println("Inverse of 2x2 Matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        if (inverse2x2 != null) {
            displayMatrix(inverse2x2);
        } else {
            System.out.println("Inverse does not exist (determinant is 0).");
        }
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.println("Transpose of 3x3 Matrix:");
        displayMatrix(transposeMatrix(matrix3x3));
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix3x3));
        System.out.println("Inverse of 3x3 Matrix:");
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        if (inverse3x3 != null) {
            displayMatrix(inverse3x3);
        } else {
            System.out.println("Inverse does not exist (determinant is 0).");
        }
    }
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers 0-9
            }
        }
        return matrix;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
    public static int determinant3x3(int[][] matrix) {
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) return null;
        double[][] adj = adjoint3x3(matrix);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / (double) det;
            }
        }
        return inverse;
    }
    public static double[][] adjoint3x3(int[][] matrix) {
        double[][] adj = new double[3][3];
        adj[0][0] = determinant2x2(new int[][]{{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}});
        adj[0][1] = -determinant2x2(new int[][]{{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}});
        adj[0][2] = determinant2x2(new int[][]{{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});
        adj[1][0] = -determinant2x2(new int[][]{{matrix[0][1], matrix[0][2]}, {matrix[2][1], matrix[2][2]}});
        adj[1][1] = determinant2x2(new int[][]{{matrix[0][0], matrix[0][2]}, {matrix[2][0], matrix[2][2]}});
        adj[1][2] = -determinant2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[2][0], matrix[2][1]}});
        adj[2][0] = determinant2x2(new int[][]{{matrix[0][1], matrix[0][2]}, {matrix[1][1], matrix[1][2]}});
        adj[2][1] = -determinant2x2(new int[][]{{matrix[0][0], matrix[0][2]}, {matrix[1][0], matrix[1][2]}});
        adj[2][2] = determinant2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});
        return transposeMatrixDouble(adj);
    }
    public static double[][] transposeMatrixDouble(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%6d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%10.4f", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}
