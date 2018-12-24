import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        double m = 0;
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        while (n > 0){
            m = m + n % 10;
            n = n / 10;
        }
        System.out.println(m);
    }
}
