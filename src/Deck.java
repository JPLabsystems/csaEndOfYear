import java.util.*;

public class Deck {
    private ArrayList<Card> cards;
    public Deck(){
        shuffleDeck();
    }
    public void shuffleDeck(){
        cards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++){
            for (int j = 1; j < 14; j++){
                cards.add(new Card(j, i));
            }
        }
        Collections.shuffle(cards);
    }
}
