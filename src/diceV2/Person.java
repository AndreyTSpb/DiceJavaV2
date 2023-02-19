package diceV2;


public class Person implements ShotDice{
    protected String name;
    protected int result = 0;
    /**
     * Возвращаем имя игрока
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Увеличивает результат на +1
     */
    public void setResult() {
        this.result += 1;
    }

    /**
     * Возвращает результат игрока
     * @return int
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Возвращает имя и результат игрока
     * @return String
     */
    public String getData() {
        return "Игрок " + this.name + " набрал побед: " + this.result;
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
}
