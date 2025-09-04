public public class SpiralMatrix {
    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Move left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // Move up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        return matrix;
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this to any size you want
        int[][] spiral = sprilmatrix {
    
}
