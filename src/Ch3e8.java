import java.util.Scanner;

/**
 * Created by timtouch on 12/18/16.
 */
public class Ch3e8 {

    public static void main(String[] args) {
        int userInput;
        int positiveInputCount = 0, negativeInputCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type an int");

        userInput = scan.nextInt();
        while(userInput != 0) {

            if(userInput > 0){
                positiveInputCount++;
            } else if (userInput < 0){
                negativeInputCount++;
            }
            System.out.println("Type an int");
            userInput = scan.nextInt();

            System.out.print("The number you typed is " + userInput);
        }

        System.out.printf("Positive number count = %d\n Negative number count = %d", positiveInputCount, negativeInputCount);

    }
}
