import java.util.Scanner;

public class HomeworkN33 {
    public static void delete(char[] ans, char[] arr, int a, int b) {
        int it = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= a && i <= b){
            }
            else {
                ans[it] = arr[i];
                it++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        String rofl = xyi.next();
        char[] arr = rofl.toCharArray();
        int a = xyi.nextInt();
        int b = xyi.nextInt();
        char[] wtf = new char[rofl.length() - (b - a + 1)];
        delete(wtf,arr,a,b);
        String result = new String(wtf);
        System.out.print(result);
    }
}
