package diceV2;
/**
 * @author Andrey Tynyanyi
 * @version 2.0
 */
public class Player implements Person{
    private String name;
    private int result = 0;

    public Player(String name){
        this.name = name;
    }

    @Override
    public int shotDice(int qntDice) {
        int sum = 0;
        for (int i=0; i < qntDice; i++){
            Dice dice = new Dice(); //бросок кубиков
            sum += dice.faceDice;
        }
        return sum; // результат
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setResult() {
        this.result += 1;
    }

    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public String getData() {
        return "Игрок " + this.name + " набрал побед: " + this.result;
    }
}
