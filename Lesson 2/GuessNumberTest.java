import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println("Игрок 1: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Игрок 2: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                        answer = scan.next();
                } while (answer != "Да" && answer != "Нет");
        } while (answer != "Нет");
    }
}