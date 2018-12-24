import java.util.Scanner;

public class HomeworkN44 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        String rofl = xyi.nextLine();
        String wtf = xyi.next();
        char[] arr = rofl.toCharArray();
        if (wtf.equals("u")){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') arr[i] -= ' ';
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z') arr[i] += ' ';
            }
        }

        rofl = new String(arr);
        System.out.println(rofl);
    }
}
