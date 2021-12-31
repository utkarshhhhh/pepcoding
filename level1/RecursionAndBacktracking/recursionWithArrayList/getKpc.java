import java.util.ArrayList;
import java.util.Scanner;

public class getKpc {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(str);
            return ans;
        }

        ArrayList<String> recRes = getKPC(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();

        char c = str.charAt(0);
        String code  = codes[c-'0'];
               
        for (int i = 0; i < code.length() ; i++){
            char ch = code.charAt(i);
            for (String st : recRes) {
                ans.add( ch + st);
            } 
        }
            
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<String> al = getKPC(str);
        System.out.println(al);
        scan.close();
    }
}