import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        // int code = 1;
        // int code2 = 2;
        // int code3 = 3;

        //Get 3 inputs from user
        //validate each input matches the code 
        //tell user if they got the combination wrong
        Scanner scan = new Scanner(System.in);
        int code[] = new int[3];
        
        for (int i = 0; i < 3; i++)

        code[i] = scan.nextInt();
        


        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        if (code[0] == 1 && code[1] == 2 && code[2] == 3) {
            System.out.println("access granted");
        }
        else {
            System.out.println("access denied");
        }
    }
}

