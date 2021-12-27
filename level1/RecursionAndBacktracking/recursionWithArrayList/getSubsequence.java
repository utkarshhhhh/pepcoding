import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(str);
            return ans;
        }

        ArrayList<String> ans = gss(str.substring(1));

        int n = ans.size();
        char c = str.charAt(0);

        for (int i = 0; i < n ; i++)
            ans.add( c + ans.get(i));       

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<String> al = gss(str);
        System.out.println(al);
        scan.close();
    }    
}