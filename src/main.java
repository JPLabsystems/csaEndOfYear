import java.util.*;


public class main {

    public static void main(String[] args)
    {
        int numPlayers;

        Scanner in = new Scanner(System.in);

        System.out.println("JAVA END OF YEAR!");
        System.out.print("WELCOME TO BLACKJACK. PLEASE ENTER THE NUMBER OF PLAYERS: ");

        numPlayers = in.nextInt();

        Game testGame = new Game(numPlayers);

        while(testGame.getStatus())
        {

        }



    }
}

