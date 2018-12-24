import java.util.Scanner;

public class HomeworkN26 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner((System.in));
        int n = xyi.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = xyi.nextInt();
        }
        for (int i = 0; i <= (n - 1) / 2; i++) {
            int c = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - i - 1] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}