import java.util.Scanner;

public class HomeworkN22 {
    public static void main(String[] args) {
            Scanner xyi = new Scanner(System.in);
            int n = xyi.nextInt();
            int[] arr = new int[n];
            arr[0] = xyi.nextInt();
            int max = Math.abs(arr[0]);
            int maxx = 0;
            for (int i = 1; i < n; i++) {
                arr[i] = xyi.nextInt();
                if (Math.abs(arr[i]) > max) {
                    max = Math.abs(arr[i]);
                    maxx = i;
                }
            }
            System.out.println(maxx);
        }
    }
