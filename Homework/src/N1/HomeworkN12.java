import java.util.Scanner;

public class HomeworkN12 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        int max = 0;
        int lin = 0;
        int n = xyi.nextInt();
        for (int i = 0; i < n; i++) {
            int nt = xyi.nextInt();
            if (max < nt) {
                lin = max;
                max = nt;
            }
        }
        System.out.println(max);
        System.out.println(lin);
    }
}
