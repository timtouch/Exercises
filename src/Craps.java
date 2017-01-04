import java.util.*;

/**
 * Created by Timothy on 1/1/2017.
 */
public class Craps {
    public Craps(CrapsPlayer player, Dice dices){
        this.player = player;
        this.dices = dices;
    }

    public void startGame(){
        Scanner input = new Scanner(System.in);
        int     bet = 0,
                result,
                point;
        boolean endGame = false,
                validInput = false;
        String inputEndGame;
        while(!endGame) {
            // Get player bet for this round
            while (!validInput) {
                System.out.println("How much will you bet?");
                bet = input.nextInt();
                input.nextLine();
                if (bet > player.getBalance()) {
                    System.out.println("You do not have that much money, your balance is: $" + player.getBalance());
                    validInput = false;
                } else if(bet <= 0) {
                    System.out.println("You cannot bet a number less than or equal to 0");
                } else {
                    validInput = true;
                }
            }
            validInput = false;
            
            // The main game logic
            result = dices.roll();
            System.out.println("You rolled " + result);
            if(result == 2 || result == 12){
                System.out.println("Sorry, you lost this bet");
                player.subFromBalance(bet);
            } else if (result == 7 || result == 11){
                System.out.println("Great job! You won this bet!");
                player.addToBalance(bet);
            } else {
                point = result;
                boolean breakPoint = false;
                System.out.println("Your point to get is " + point);
                while (!breakPoint){
                    result = dices.roll();
                    System.out.println("You rolled " + result);
                    if (result == point){
                        System.out.println("You matched your point! You won the bet!");
                        player.addToBalance(bet);
                        breakPoint = true;
                    } else if(result == 7){
                        System.out.println("Ouch! Looks like you lost this time...");
                        player.subFromBalance(bet);
                        breakPoint = true;
                    } else {
                        System.out.println("Let's roll again!");
                    }
                }

            }

            System.out.println("Your current balance is now: $" + player.getBalance());
            do {
                System.out.println("Do you want to bet again? (Y/N)");
                inputEndGame = input.nextLine().toUpperCase();
            } while ( !inputEndGame.equals("Y") && !inputEndGame.equals("N"));
            if (inputEndGame.equals("N")){
                endGame = true;
                System.out.println("Thanks for your money!");
            }
        }
    }



    private CrapsPlayer player;
    private Dice dices;
}
