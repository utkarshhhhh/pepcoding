import java.util.ArrayList;
import java.util.Scanner;

public class getMazePathWithJumps {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans);
        scan.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        for (int jump = 1; sc + jump <= dc; jump++) {
            ArrayList<String> hAns = getMazePaths(sr, sc + jump, dr, dc);
            for (String str : hAns) {
                myAns.add('h' + "" + jump + str);
            }
        }

        for (int jump = 1; sr + jump <= dr; jump++) {
            ArrayList<String> vAns = getMazePaths(sr + jump, sc, dr, dc);
            for (String str : vAns) {
                myAns.add('v' + "" + jump + str);
            }
        }

        for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++) {
            ArrayList<String> dAns = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String str : dAns) {
                myAns.add('d' + "" + jump + str);
            }
        }
        return myAns;

    }
}
