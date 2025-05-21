public class Player {

    private int playerNumber;
    private String playerName;

    public Player(String n) {
        playerNumber = 0;
        playerName = n;
    }

    public void hit() {
        Deck.draw();
    }

    public void stay() {

    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int n) {
        playerNumber = n;
    }

    class Dealer extends Player {
        public Dealer(String n) {
            super(n);
        }

    }
}
