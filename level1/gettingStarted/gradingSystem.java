import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        String res;
        if(marks > 90){
            res = "excellent";
        }else if(marks > 80 && marks <= 90){
            res = "good";
        }else if(marks > 70 && marks <= 80){
            res = "fair";
        }else if(marks > 60 && marks <= 70){
        res = "meets expectations";
        }else res = "below par";
        System.out.println(res);

        scan.close();
}
}
