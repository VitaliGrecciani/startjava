import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int randomNumber;
    private boolean win;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
            win = true;
            randomNumber = (int) (Math.random() * 101);
            System.out.println("Угадай число !");
            do {
                enterNumber(player1);
                compareNumber(player1);
                if (win) {
                    enterNumber(player2);
                    compareNumber(player2);
            }
        } while(win);
    }

    public void enterNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setGuessNumber(scan.nextInt());
    }

    private void compareNumber(Player player) {
            if (player.getGuessNumber() == randomNumber) {
                System.out.println (" Вы угадали! " + player.getGuessNumber());
               win = false; 
            } else if (player.getGuessNumber() > randomNumber) {
                System.out.println(" введенное число больше того, что загадал компьютер " + randomNumber );
            } else if (player.getGuessNumber() < randomNumber) {
                System.out.println(" введенное число меньше того, что загадал компьютер " + randomNumber );
            }
        } 
    }