import java.util.Scanner;

public class HomeworkN14 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        double ch = 0;
        double nech = 0;
        for (int i = 0; i < n; i++) {
            double np = xyi.nextInt();
            if (np % 2 == 0){
                ch = ch + np;
            }
            else{
                nech = nech + np;
            }
        }
        System.out.println(ch);
        System.out.println(nech);
    }
}
