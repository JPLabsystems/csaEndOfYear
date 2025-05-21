public class Card
{
    private int value;
    private int actualValue;
    private String valueString;
    private int faceValue;
    private String name;

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
                actualValue = 10;
                break;
            case 12:
                valueString = "queen";
                actualValue = 10;

                break;
            case 13:
                valueString = "king";
                actualValue = 10;

                break;
            default:
                valueString =  String.valueOf(v);
                break;
        }


        faceValue = n;
        switch (n) {
            case 0:
                name = "spades";
                break;
            case 1:
                name = "clubs";
                break;
            case 2:
                name = "diamonds";
                break;
            case 3:
                name = "hearts";
                break;
        }
    }

    public String printCard()
    {
        return "" + valueString + " of " + name;
    }
}
