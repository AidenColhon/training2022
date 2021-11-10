import java.util.Scanner;

public class Hello {
    public static void main(String arges[]) {
        // ASSIGNMENT;
        // Get two numbers from the user 
        // Print them added together
        // Print them multiplied 
        // Make each one contain the others vaule 

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(a + b );
        System.out.println(a * b );
        System.out.println("a + b = " + (a+b));
        System.out.println("a * b = " + (a*b));

        if(a < b) {
            System.out.println("A is less than B");
        }
        else {
            System.out.println("B is less than A");
        }
    }
}