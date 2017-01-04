import java.util.*;

/**
 * Created by timtouch on 12/18/16.
 */
public class TestClass {
    
    
    public static void main(String[] args) {
        
        Dice dices = new Dice(2);
        CrapsPlayer player = new CrapsPlayer(1000);
        Craps game = new Craps(player, dices);
        
        game.startGame();
        
    }
}
