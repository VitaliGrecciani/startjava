import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int compareNum;
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
        compareNum = (int) (Math.random() * 101);
        System.out.println("Угадай число !");
        do {
            enterNumber(player1);
            System.out.print(player1.getName() + ":");
            scan.nextLine();
            checkNumber(player1);
            if(win) {
                enterNumber(player2);
                System.out.print(player2.getName() + ":");
                checkNumber(player2);
            }
        } while(true);
    }
        
    public boolean endGame() {
        String answer;
        System.out.print("Хотите продолжить? [да/нет]: ");
        answer = scan.nextLine();
        do {
             while (!answer.equals("нет") && !answer.equals("да"));
        } while (!answer.equals("нет"));
        return true;
    } 
    
    public void enterNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setGuessNumber(scan.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getGuessNumber() == compareNum) {
            System.out.println(" Вы угадали  " + player.getGuessNumber());
            if (endGame());
            return false;
        } else {
            System.out.println(" введенное число не соответствует тому, что загадал компьютер (" + compareNum +")");
            return true;
        }
    }
}





