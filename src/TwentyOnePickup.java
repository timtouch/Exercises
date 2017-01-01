import java.util.*;
/**
 * Created by Timothy on 1/1/2017.
 */
public class TwentyOnePickup {
    public static void main(String[] args) {
        printInstructions();
        int numberOfStones = 21;
        boolean playerMovedLast = false;
        while(numberOfStones > 0){
            numberOfStones = playerMove(numberOfStones);
            playerMovedLast = true;
            if(numberOfStones > 0){
                numberOfStones = computerMove(numberOfStones);
                playerMovedLast = false;
            }

        }
        if(playerMovedLast){
            System.out.println("Congradulations, you won.");
        } else {
            System.out.println("Better luck next time.");
        }
    }

    static void printInstructions(){
        System.out.println(
                "The object of this game is to remove the last stone.\n" +
                "There are 21 stones in the pile to start with.\n" +
                "You may remove from 1 to 3 stones on each move.\n" +
                "Good luck!"
        );
    }

    static int playerMove(int numberOfStones){
        int move = getUserMove(numberOfStones);
        System.out.println("There are " + numberOfStones + " stones remaining.");
        return numberOfStones;
    }

    static int computerMove(int numberOfStones){
        int move;
        if(numberOfStones <= 3){
            move = numberOfStones;
        }
        else {
            move = numberOfStones % 4;
        }
        numberOfStones = numberOfStones - move;
        System.out.println("The computer removes " + move + " stones leaving " + numberOfStones + ".");
        return numberOfStones;
    }

    static int getUserMove(int numberOfStones){
        System.out.println("Your move - how many stones do you wish to remove?");
        int move = scan.nextInt();
        while (move > numberOfStones || move < 1 || move > 3){
            if(numberOfStones >= 3){
                System.out.println("Sorry, you can only remove between 1 to 3 stones.");
            }
            else {
                System.out.println("Sorry, you can only remove 1 to " + numberOfStones + " stones.");
            }
            System.out.println("How many stones do you wish to remove?");

            move = scan.nextInt();
        }
        return move;
    }

    static final Scanner scan = new Scanner(System.in);
}
