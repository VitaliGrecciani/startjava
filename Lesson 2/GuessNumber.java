import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Угадай число !");
        do {
            enterNumber(player1);
            if (compareNumber(player1)) {
                break;
            }
            enterNumber(player2);
            if (compareNumber(player2)) {
                break;
            }
        } while(true);
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setGuessNumber(scan.nextInt());
    }

    private boolean compareNumber(Player player) {
        if (player.getGuessNumber() > randomNumber) {
            System.out.println(" введенное число больше того, что загадал компьютер " + randomNumber );
        } else if (player.getGuessNumber() < randomNumber) {
            System.out.println(" введенное число меньше того, что загадал компьютер " + randomNumber );
        } else { 
            System.out.println (" Вы угадали! " + player.getGuessNumber());
            return true;
        } return false;
    } 
}
