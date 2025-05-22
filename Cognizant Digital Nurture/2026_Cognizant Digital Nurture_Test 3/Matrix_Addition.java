import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int row;
        int col;
        int i;
        int j;
        Scanner in = new Scanner(System.in);

        row = in.nextInt();
        col = in.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}