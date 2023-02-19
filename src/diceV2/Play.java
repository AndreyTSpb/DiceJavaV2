package diceV2;
/**
 * @author Andrey Tynyanyi
 * @version 2.0
 */
public class Play {

    public String resultStr;
    private static int qntDice;
    private static Person[] players; //Массив обьектов игроки

    /**
     * Запуск игры
     * @param players массив с игроками
     * @param qntDice количество кубиков в игре
     */
    public Play(Person[] players, int qntDice){
        Play.players = players;
        Play.qntDice = qntDice;
        int winner = 0;
        int i = 1;
        while (Play.players[winner].getResult() < 7){
            winner = round(i, winner);
            i++;
            Play.players[winner].setResult(); //считаем победы
            if(i > 1000) break; //ограничение на всякий случай
        }
        this.resultStr =  "Победил игрок №" + (winner+1) + " " + Play.players[winner].getName();
    }

    /**
     * Игровой раунд
     * @param r - int - номер раунда
     * @param winner - int - номер победителя в предыдущем раунде
     * @return - int - номер победителя в текущем раунде
     */
    private static int round(int r, int winner){
        int[] roundResult = new int[Play.players.length];
        //первым бросает победитель
        roundResult[winner] = Play.players[winner].shotDice(Play.qntDice);
        for(int i = 0; i < Play.players.length; i++){
            if(i == winner) continue; //пропускаем победителя
            roundResult[i] = Play.players[i].shotDice(Play.qntDice);
        }
        return testRound(roundResult); //проверка у кого больше выпало
    }
    /**
     * Проверка результатов раунда
     * @param roundResult - массив с результатами раунда
     * @return - номер победителя в раунде
     */
    private static int testRound(int[] roundResult){
        int max = roundResult[0];
        int key = 0;

        for(int i = 1; i < roundResult.length; i++){
            if( max < roundResult[i]){
                max = roundResult[i];
                key = i;
            }
        }
        return  key;
    }

    /**
     * Вывод результатов всех игроков
     */
    public void viewGamersResult(){
        System.out.println("Результаты всех игроков: ");
        for (int i = 0; i < Play.players.length; i++){
            System.out.println(Play.players[i].getData());
        }
    }
}
