import java.util.Scanner;

public class HomeworkN32 {
    public static void move(char[] arr) {
    char c = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }
    arr[0] = c;
}

    public static void main(String[] args){
        Scanner xyi = new Scanner(System.in);
        String rofl = xyi.next();
        char[] arr = rofl.toCharArray();
        int n = xyi.nextInt();
        for (int i = 0; i < (n % (int) rofl.length()); i++) move(arr);
        for (int i = 0; i < rofl.length(); i++) System.out.print(arr[i]);
    }
}
