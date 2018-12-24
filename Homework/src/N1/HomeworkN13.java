import java.util.Scanner;

public class HomeworkN13 {
    public static void main(String[] args) {
        int rofl = 1;
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        for (int i = 0; i < n; n--) {
            rofl = rofl * n;
        }
        System.out.println(rofl);
    }
}
