public class MatrixOperations2 {

    //Create random matrix
    public static double[][] createRandomMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
        return matrix;
    }

    //Transpose
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    //Determinant 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    //Determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    //Inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    //Inverse 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    //Display matrix
    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%6.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix = createRandomMatrix(3);

        System.out.println("Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));

        System.out.println("Determinant: " + determinant3x3(matrix));

        System.out.println("Inverse:");
        displayMatrix(inverse3x3(matrix));
    }
}
