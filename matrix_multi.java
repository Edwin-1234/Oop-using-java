class matrix {
    int row, col;
    int[][] matrix;

    public matrix(int[][] mat, int r, int c) {
        this.row = r;
        this.col = c;
        this.matrix = mat;
    }

    matrix multiply(matrix m2) {
        int[][] resultData = new int[this.row][m2.col];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < m2.col; j++) {
                int element = 0;
                for (int k = 0; k < this.col; k++) {
                    element += this.matrix[i][k] * m2.matrix[k][j];
                }
                resultData[i][j] = element;
            }
        }

        return new matrix(resultData, this.row, m2.col);
    }

    void display() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] a = { { 1, 2 }, { 3, 4 } };
        int[][] b = { { 5, 6 }, { 7, 8 } };
        matrix m1 = new matrix(a, 2, 2);
        matrix m2 = new matrix(b, 2, 2);
        matrix m3 = m1.multiply(m2);
        m3.display();
    }
}
