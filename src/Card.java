public class Card
{
    private int value;
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
}
