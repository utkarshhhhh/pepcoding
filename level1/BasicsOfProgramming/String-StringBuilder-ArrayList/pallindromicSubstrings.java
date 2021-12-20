import java.util.Scanner;

public class pallindromicSubstrings {

    public static boolean pallindrome(String str) {
        
        int i=0 , j= str.length()-1;

        while ( i<=j ) {
            if(str.charAt(i) == str.charAt(j)){
                i++; j--;
            }            
            else return false;
        }
        return true;
    }

    public static void allPallin(String str) {
        int l = str.length();

        for (int st = 0; st < l; st++) {
            for (int end = st;  end< l; end++) {
                
                String subS = str.substring(st, end+1);
                if( pallindrome(subS))
                    System.out.println(subS);
            }
        }
    }


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //System.out.println(pallindrome(str));
        allPallin(str);
        scan.close();
    }
}