import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int tapNumber;
    private Player player1;
    private Player player2;
    private boolean win;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play() {
        win = true;
        tapNumber = (int) (Math.random()*101);
        do {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setGuessNumber(scan.nextInt());
            scan.nextLine();
            tapNumber(player1);
            if(win) {
                System.out.print(player2.getName() + ", введите число: ");
                player2.setGuessNumber(scan.nextInt());
                tapNumber(player2);
            }
        } while(win);
    }

    private boolean tapNumber(Player player) {
        if (player.getGuessNumber() > tapNumber) {
            System.out.println("Введенное число больше того, что загадал компьютер (" + tapNumber +")");
        return true;
        } else if (player.getGuessNumber() < tapNumber) {
            System.out.println("Введенное число меньше того, что загадал компьютер (" + tapNumber +")");
        return true;
        } else if (player.getGuessNumber() == tapNumber) {
            System.out.println(player.getName() + ", Вы угадали. " + player.getGuessNumber());
            win = false;
        } return false;
    }
}



