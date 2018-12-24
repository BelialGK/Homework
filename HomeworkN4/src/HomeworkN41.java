import java.util.Scanner;

public class HomeworkN41 {
    public static void main(String[] args) {
        Scanner xyi = new Scanner(System.in);
        String rofl = "y";
        double wtf = xyi.nextDouble();
        String lol = xyi.next();
        double yeah = xyi.nextDouble();
        while (true) {
            if (lol.equals("+")) {
                System.out.println(wtf + yeah);
                wtf += yeah;
            } else if (lol.equals("-")) {
                System.out.println(wtf - yeah);
                wtf -= yeah;
            } else if (lol.equals("*")) {
                System.out.println(wtf * yeah);
               wtf *= yeah;
            } else if (lol.equals("/")) {
                System.out.println(wtf / yeah);
                wtf /= yeah;
            }
            rofl = xyi.next();
            if (rofl.equals("y")) {
                lol = xyi.next();
                yeah = xyi.nextDouble();
            } else {
                wtf = xyi.nextDouble();
                lol = xyi.next();
                yeah = xyi.nextDouble();
            }
        }
}
