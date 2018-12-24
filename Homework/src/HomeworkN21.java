import java.util.Scanner;

public class HomeworkN21 {
    public static void main(String[] args) {
            Scanner xyi = new Scanner(System.in);
        System.out.println("Введите кол-во студентов");
            int n = xyi.nextInt();
            int summ = 0;
            double avrg;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Рост студента");
                arr[i] = xyi.nextInt();
                summ += arr[i];
            }
            avrg = summ / (double) n;
            summ = 0;
            for (int i = 0; i < n; i++)
                summ += (arr[i] >= avrg) ? 1 : 0;
            System.out.println(avrg);
            System.out.println(summ);
    }
}
