import java.util.Scanner;

public class HomeworkN23 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner((System.in));
        int n = xyi.nextInt();
        int[] arr = new int[n];
        int rofl = 0;
        arr[0] = xyi.nextInt();
        for (int i = 1; i < n-1; i+=2) {
            arr[i] = xyi.nextInt();
            arr[i+1] = xyi.nextInt();
            rofl+=(arr[i] > arr[i-1] && arr[i] > arr[i+1])?1:0;
        }
        System.out.println(rofl);
    }
}
