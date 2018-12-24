import java.util.Scanner;

public class HomeworkN31 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = xyi.nextInt();
        int m = xyi.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = xyi.nextInt();

        int startIndex = -1;
        boolean rofl = false;

        for (int i = 0; i <= n - m; i++) {
            if (arr1[i] == arr2[0]) {
                startIndex = i;
                i++;
                rofl = true;
                for (int j = 1; j < m; i++, j++)
                    if (arr1[i] != arr2[j]) {
                        rofl = false;
                        break;
                    }
            }
            if (rofl) break;
        }
        if (rofl) System.out.println(startIndex);
        else System.out.println("No");
    }
}