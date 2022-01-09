import java.util.Scanner;

public class knightsTour {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        printKnightsTour(new int[n][n], r, c, 1);
        scn.close();
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {

        int n = chess.length;
        if (r < 0 || c < 0 || r >= n || c >= n || chess[r][c] != 0)
            return;

        chess[r][c] = upcomingMove;

        if (upcomingMove == n * n) {
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        for (int i = 0; i < dir.length; i++) {

            int x = r + dir[i][0];
            int y = c + dir[i][1];
            printKnightsTour(chess, x, y, upcomingMove + 1);
        }
        chess[r][c] = 0;
    }
}
