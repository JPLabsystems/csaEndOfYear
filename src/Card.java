public class Card
{
    private int value;
    private int gameValue;
    private String valueString;
    private int suitValue;
    private String suit;

    /*
    values:
    0: spade
    1: clubs
    2: diamond
    3: hearts
     */

    public Card(int v, int n)
    {
        value = v;
        switch (v){
            case 1:
                valueString = "ace";
                break;
            case 11:
                valueString = "jack";
                gameValue = 10;
                break;
            case 12:
                valueString = "queen";
                gameValue = 10;

                break;
            case 13:
                valueString = "king";
                gameValue = 10;

                break;
            default:
                valueString =  String.valueOf(v);
                break;
        }


        suitValue = n;
        switch (n) {
            case 0:
                suit = "spades";
                break;
            case 1:
                suit = "clubs";
                break;
            case 2:
                suit = "diamonds";
                break;
            case 3:
                suit = "hearts";
                break;
        }
    }

    public String printCard()
    {
        return "" + valueString + " of " + suit;
    }
}
