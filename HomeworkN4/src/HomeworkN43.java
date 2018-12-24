import java.util.Scanner;

public class HomeworkN43 {
    static int toInt(String a){
        int rofl = 1;
        int wtf = 0;
        char[] arr = a.toCharArray();
        for(int i = arr.length - 1; i >= 0; rofl*=10, i--){
            wtf += (arr[i]-'0')*rofl;
        }
        return wtf;
    }
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        String str = xyi.nextLine();
        System.out.println(toInt(str));
    }
}
