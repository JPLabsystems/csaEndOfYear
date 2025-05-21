public class Game {

    private int numPlayers;
    private boolean gamePlaying = false;

    private int playerIndex = 0;

    private Deck cardDeck;

    public Game(int num) {
        numPlayers = num;
        cardDeck = new Deck();
        gamePlaying = true;

        startGame();
    }

    public void startGame() {
        // reset the deck
        // Initiate the number of players
    }

    public boolean getStatus()
    {
        return gamePlaying;
    }


//
//    public void move(Player p)
//    {
//
//    }
//
}
