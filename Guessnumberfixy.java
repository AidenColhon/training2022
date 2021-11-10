import java.util.*;

public class Guessnumberfixy {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        var userNumber = 100;
        var counter = 0;
        var maxtries = 7;
        var a = 0;
        var b = 100;
        // keep track of the lowest number
        // keep track of the highest number
        while (counter < maxtries) {
            // firgure out the guess
            userNumber = (a + b) / 2;
            System.out.print("The computer guessed: " + userNumber);
            String userResponse = scan.next();
            // check user response
            if (userResponse.equals("higher")) {
                a = userNumber;
                // change the boundry change the lower number
            } else if (userResponse.equals("lower")) {
                b = userNumber;
                // change the boundry change the higher number
            } else if (userResponse.equals("correct")) {
                System.out.print("I win, play again");
                break;

            } else if (maxtries < counter) {
                System.out.print("I lost, play again");
                break;

            }
            counter += 1;
        }

        System.out.print("The number is: ");
        System.out.println(userNumber);

    }

}
