import java.util.Scanner;

/**
 * Created by timtouch on 12/18/16.
 */
public class TestClass {
    public static void main(String[] args) {
        Dice dices = new Dice(2);
        CrapsPlayer player = new CrapsPlayer(10000);
        Craps craps = new Craps(player, dices);

        Scanner scan = new Scanner(System.in);

        System.out.println("Input number:");
        int num = scan.nextInt();
        System.out.println(num);

        //craps.startGame();

    }
}
