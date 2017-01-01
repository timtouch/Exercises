import javax.swing.*;
import java.awt.*;

/**
 * Created by Timothy on 1/1/2017.
 */
public class CrapsGUI {
    public static void main(String[] args) {
        Dice dice = new Dice(1);

        JFrame frame = new JFrame("Frame");
        Container pane = frame.getContentPane();
        JTextField firstDiceNumber = new JTextField(20);
        JTextField secondDiceNumber = new JTextField(20);
        JButton rollDice = new JButton("Roll Dice");


        pane.setLayout(new GridLayout(3, 2));
        pane.add(new JLabel("Dice 1"));
        pane.add(firstDiceNumber);
        pane.add(new JLabel("Dice 2"));
        pane.add(secondDiceNumber);
        pane.add(rollDice);



    }
}
