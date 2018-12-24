import java.util.Scanner;

public class HomeworkN52 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        String rofl = xyi.nextLine();
        String flag = xyi.next();
        char[] arr = rofl.toCharArray();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= '0' && arr[i] <= '9')
                arr[i] = '*';
        rofl = new String(arr);
        System.out.println(rofl);
    }
}
