import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String quit = "contunie";
        while (!quit.equals("stop")) {

            double a = scan.nextDouble();
            String op = scan.next();
            double b = scan.nextDouble();

            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            }

            else if (op.equals("*")) {
                System.out.println(a * b);
            }

            else if (op.equals("/")) {
                System.out.println(a / b);
            }
            quit = scan.next();

        }
    }
}
