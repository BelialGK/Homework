import java.util.Scanner;
public class HomeworkN24 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        int n = xyi.nextInt();
        int[] arr = new int[n];
        boolean rofl = true;
        int wtf = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = xyi.nextInt();
        }

        for (; wtf < n-1 && arr[wtf] <= arr[wtf+1] ; wtf++);

        for(;wtf < n-1 && rofl; wtf++){
            if(arr[wtf] < arr[wtf+1]){
                rofl = false;
            }
        }
        System.out.println(rofl);
    }
}
