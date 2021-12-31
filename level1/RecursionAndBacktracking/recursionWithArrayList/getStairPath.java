import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {

    public static ArrayList<String> gsp(int n) {
        
        if(n==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 3 ; i++) {
            if(n-i >= 0){
                ArrayList<String> myAns = gsp(n-i);

                for (String ele : myAns) 
                    ans.add(i + ele);                
            }            
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> al = gsp(n);
        System.out.println(al);
        scan.close();
    }    
}