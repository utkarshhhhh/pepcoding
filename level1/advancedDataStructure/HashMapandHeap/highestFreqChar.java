import java.util.HashMap;
import java.util.Scanner;

public class highestFreqChar {

    public static char solve(String str) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put( str.charAt(i) , map.getOrDefault(str.charAt(i), 0) + 1);
        }

        char maxChar = str.charAt(0);

        for (Character c : map.keySet()) {
            
            if( map.get(c) > map.get(maxChar)){
                maxChar = c;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println( solve(s) );
        scan.close();
    }
    
}