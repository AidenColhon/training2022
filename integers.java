import java.util.Scanner;

public class integers {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.println(avg(a, b, c));

        System.out.println(avg(a, c, 42));

        System.out.println(avg(b, b, 7));

    }

}
