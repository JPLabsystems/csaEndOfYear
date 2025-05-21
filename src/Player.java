import java.util.*;

public class Player {

    private int playerNumber;
    private String playerName;

    private Game thisGame;

    private ArrayList<Card> cards;

    public Player(String n, Game g) {
        playerNumber = 0;
        playerName = n;
        thisGame = g;

        cards = new ArrayList<Card>();

        cards.add(thisGame.getACard());
        cards.add(thisGame.getACard());

    }

    public void hit() {
//        cardDeck.draw();
    }

    public void stay() {

    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int n) {
        playerNumber = n;
    }
}

class Dealer extends Player {
    public Dealer(String n, Game g) {
        super(n, g);
    }

}
