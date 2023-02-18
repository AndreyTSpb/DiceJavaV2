package diceV2;

import java.util.Random;
/**
 * @author Andrey Tynyanyi
 * @version 2.0
 */
public class Dice {
    Random rand = new Random();
    public int faceDice;

    public Dice(){
        faceDice = rand.nextInt(6)+1;
    }
}
