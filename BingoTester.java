package bingogame;

public class BingoTester {

  
    public static void main(String[] args) 
    {

            BingoGame game = new BingoGame();

            for(int i=1; i<=25; i++)
                game.addEvent(Integer.toString(i));
            game.startGame();

    }
}
