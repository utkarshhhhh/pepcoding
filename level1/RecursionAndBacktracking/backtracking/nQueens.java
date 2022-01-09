import java.util.Scanner;

public class nQueens {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNQueens(new int[n][n], "", 0);
        scn.close();
    }

    // approach 1.brute force(queen at every cell) 2.direction 8->3
    public static boolean isSafe(int[][] chess, int row, int col) {

        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--)
            if (chess[r][c] == 1)
                return false;

        for (int r = row - 1, c = col; r >= 0 && c >= 0; r--)
            if (chess[r][c] == 1)
                return false;

        for (int r = row - 1, c = col + 1; r >= 0 && c < chess.length; r--, c++)
            if (chess[r][c] == 1)
                return false;

        return true;
    }

    public static void printNQueens(int[][] chess, String ans, int row) {

        if (row == chess.length) {
            System.out.println(ans + '.');
            return;
        }

        for (int i = 0; i < chess.length; i++) {

            if (isSafe(chess, row, i)) {
                chess[row][i] = 1;
                printNQueens(chess, ans + row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;
            }
        }
    }
}