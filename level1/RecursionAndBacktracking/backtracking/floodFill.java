import java.util.Scanner;

public class floodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");

        scn.close();
    }

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static char[] dirChar = { 't', 'l', 'd', 'r' };

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String ans) {

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1) 
            return;
        
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        
        maze[sr][sc] = 1;
        for (int i = 0; i < dir.length; i++) {

            int x = sr + dir[i][0];
            int y = sc + dir[i][1];
            floodfill(maze, x, y, ans + dirChar[i]);
        }
        maze[sr][sc] = 0;

    }
}