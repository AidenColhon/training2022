
//import java.io.*;
import java.util.*;

public class Guessnumber {
    public static void main(String args[]) {
        var userNumber = 100;
        var counter = 0;
        var maxtries = 7;
        var randomNumber = Math.floor(Math.random() * userNumber + 1);
        while (userNumber != randomNumber && counter < maxtries) {
            // var attempts = prompt("please pick a number 1 and 10" + userNumber);

            Scanner scan = new Scanner(System.in);
            System.out.print("please pick a number 1 and 100: ");
            userNumber = scan.nextInt();

            System.out.print("The user entered: ");
            System.out.println(userNumber);
            counter += 1;
            if (counter > maxtries) {
                System.out.println("You have no more turns left. Please try again");

            }
            if (maxtries == randomNumber) {
                System.out.println("Congrates you guess the correct number");
                System.out.println(" the random number was " + randomNumber);
                System.out.println(" it took you " + counter + "attempts to guess the correct number");
                scan.close();
            }
            if (randomNumber > userNumber) {
                System.out.println("Greater");
            }

            else {
                System.out.println("Lesser");
            }
        }

        System.out.print("The number is: ");
        System.out.println(randomNumber);

    }

}
