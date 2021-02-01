public class Player {
    private String name;
    private int guessNumber;

    public Player(String name) {
        this.name = name;
     }

    public String getName() {
        return name;
    }

    public int getGuessNumber() {
        return guessNumber;
    }
    
    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }
}