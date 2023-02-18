package diceV2;


public interface Person {
    /**
     * Бросок кубиков
     * @param qntDice количесвто кубиков которые будут бросать
     * @return int сумму кубиков
     */
    public int shotDice(int qntDice);

    /**
     * Возвращаем имя игрока
     * @return
     */
    public String getName();

    /**
     * Увеличивает результат на +1
     */
    public void setResult();

    /**
     * Возвращает результат игрока
     * @return int
     */
    public int getResult();

    /**
     * Возвращает имя и результат игрока
     * @return String
     */
    public  String getData();
}
