public class Game {

    private Player[] players;
    private int numPlayers;
    private boolean gamePlaying = false;
    private int playerIndex = 0;
    public Deck cardDeck;

    public Game(int num) {
        numPlayers = num;
        cardDeck = new Deck();
        gamePlaying = true;

        players = new Player[numPlayers];
        for(int i = 0; i < players.length; i++)
        {
            players[i] = new Player(String.valueOf(i+1), this)
        }


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
