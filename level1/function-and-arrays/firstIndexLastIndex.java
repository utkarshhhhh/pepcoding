import java.util.Scanner;

public class firstIndexLastIndex {
    static void fi(int arr[], int d) {

    int s = 0, e = arr.length - 1, mid;
    int i = -1;
    while (s <= e) {

      mid = (s + e) / 2;
      if (arr[mid] == d) {
        i = mid;
        e = mid - 1;
      }
      else if ( arr[mid] < d)
        s = mid + 1;
      else
        e = mid - 1;
    }
    System.out.println( i );
  }
  
  public static void li(int arr[], int d) {

    int s = 0, e = arr.length - 1, mid;
    int i = -1;
    while (s <= e) {

      mid = (s + e) / 2;
      if (arr[mid] == d) {
        i = mid;
        s = mid + 1;
      }
      else if ( arr[mid] < d) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    System.out.println( i );
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] arr = new int[n];

    for (int i = 0 ; i < n ; i++)
      arr[i] = scan.nextInt();
    int d = scan.nextInt();

    fi(arr, d);
    li(arr, d);
    scan.close();
  } 
}
