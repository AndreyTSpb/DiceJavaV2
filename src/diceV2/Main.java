package diceV2;

import java.util.Scanner;
/**
 * @author Andrey Tynyanyi
 * @version 2.0
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in); //Для ввода с клавиатуры
    private static int qntGamers; //Кол-во игроков
    private static int qntDice; //Кол-во кубиков
    private static Player[] players; //Массив с игроками

    public static void main(String[] args) {
        Main.enterGamers(); //Добавление играков в игру
        Play play = new Play(Main.players, Main.qntDice); //Запуск игры
        System.out.println(play.resultStr); //Вывод победителя
        play.viewGamersResult();
    }

    /**
     * Ввод играков в игру
     */
    public static void enterGamers(){
        //количество игроков
        while (Main.qntGamers < 2) {
            System.out.print("Количество игроков в игре: ");
            Main.qntGamers = Main.scanner.nextInt();
        }

        //количество кубиков
        while (Main.qntDice < 2){
            System.out.print("Укажите количество кубиков для игры: ");
            Main.qntDice = Main.scanner.nextInt();
        }

        System.out.println(Main.qntGamers);
        //Создаем массив с нужным кол-м пользователей
        players = new Player[Main.qntGamers];

        //Заполняем массив игроками
        for(int i = 0; i < Main.qntGamers-1; i++)
        {
            System.out.print("Ведити имя игрока №" + (i+1) + ": ");
            players[i] = new Player(Main.scanner.next());
        }
        //последним добавляем компьютер
        players[Main.qntGamers-1] = new Player("Компьютер");
    };

    public static void viewPlayers(Player[] players){
        for (int i = 0; i < Main.qntGamers; i++){
            System.out.println(i + " " + players[i].getName());
        }
    }
}
