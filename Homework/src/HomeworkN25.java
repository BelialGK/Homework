import java.util.Scanner;

public class HomeworkN25 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        int[] arr = new int[n];
        int rofl = 0;
        for (int i = 0; i < n; i++)
            arr[i] = xyi.nextInt();
        int wtf = 1;
        for (int i = n-1; i >= 0; i--) {
            while(arr[i] > 0){
                rofl += (arr[i]%10)*wtf;
                arr[i]/=10;
                wtf*=10;
            }
        }
        System.out.println(rofl);
    }
}
