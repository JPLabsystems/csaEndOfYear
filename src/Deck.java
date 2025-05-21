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
        Collections.shuffle(cards); //whats this vro
    }

    public void printDeck()
    {
        for(int i = 0; i <cards.size(); i++)
        {
            System.out.printf("Card %d is a %s\n", i+1, cards.get(i).printCard());
        }
    }

    public String toString() {
        return "";
    }

    public void draw() {
        System.out.println(cards.get(0));

        cards.remove(0);
    }
}
