import java.util.Scanner;

public class function {
    public static void main(String args[]) {
        System.out.println(sum(166));
        System.out.println(sum(6000));
    }

    public static int sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; ++i) {
            sum = sum + i;
        }
        return sum;
    }
}
