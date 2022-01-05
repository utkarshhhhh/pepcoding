import java.util.Scanner;

public class printMazePathWithJumps {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
        scan.close();
    }

    public static void printMazePaths1(int sr, int sc, int dr, int dc, String ans) {

        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        for (int jump = 1; sc + jump <= dc; jump++)
            printMazePaths1(sr, sc, dr, dc, ans);

        for (int jump = 1; sr + jump <= dr; jump++)
            printMazePaths1(sr, sc, dr, dc, ans);

        for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++)
            printMazePaths1(sr, sc, dr, dc, ans);

    }

    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
    static char[] dirChar = { 'h' , 'v' , 'd' };

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {

        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        for (int d = 0; d < dir.length; d++) {
            for (int jump = 1; jump <= Math.max(dr, dc); jump++){

                int r = sr + jump*dir[d][0]; 
                int c = sc + jump*dir[d][1]; 

                if( r <= dr && c <= dc )
                printMazePaths(r, c, dr, dc, ans + dirChar[d] + jump);

            }            
        }
    }
}
