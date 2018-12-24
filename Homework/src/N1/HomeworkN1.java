import java.util.Scanner;

public class HomeworkN1 {
    public static void main(String[] args){
        Scanner xyi = new Scanner(System.in);
        int max = 0;
        int n = xyi.nextInt();
        for (int i = 0; i < n; i++){
            int nt = xyi.nextInt();
            if  (max < nt){
                max = nt;
            }
        }
        System.out.println(max);
    }
}
