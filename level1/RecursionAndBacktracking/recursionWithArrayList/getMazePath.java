import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
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

        if (sc + 1 <= dc) {
            ArrayList<String> recAns = getMazePaths(sr, sc + 1, dr, dc);
            for (String str : recAns) {
                myAns.add('h' + str);
            }
        }

        if (sr + 1 <= dr) {
            ArrayList<String> recAns = getMazePaths(sr + 1, sc, dr, dc);
            for (String str : recAns) {
                myAns.add('v' + str);
            }
        }
        return myAns;

    }
}
