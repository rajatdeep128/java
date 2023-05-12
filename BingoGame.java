package bingogame;
import java.util.ArrayList;
import java.util.Scanner;


public class BingoGame
{

    private ArrayList<String> eventList;
    private final int DEFAULT_PLAYER_COUNT = 2;
    private int playerCount;
    private boolean winnerDetermined;
    private ArrayList<BingoBoard> boardList;

    BingoGame()
    {
        this.eventList = new ArrayList<>();
        this.playerCount = DEFAULT_PLAYER_COUNT;
        this.winnerDetermined = false;
        this.boardList = new ArrayList<>();
    } 

    BingoGame(int players)
    {
        this.eventList = new ArrayList<>();
        this.playerCount = players;
        this.winnerDetermined = false;
        boardList = new ArrayList<>();
    } 

     
    public void addEvent(String event)
    {
        this.eventList.add(event);
    }

    //Main driver for the game.
    public void startGame()
    {
        this.winnerDetermined = false;
        for(int i = 1; i <= this.playerCount;i++)
        {
            ArrayList<String> events = (ArrayList<String>) eventList.clone();
            BingoBoard board = new BingoBoard(events,i);
            board.randomizeEvents();
            this.boardList.add(board);
            board.printBoard();
        }
        Scanner in = new Scanner(System.in);
        while(this.winnerDetermined == false)
        {
            System.out.println("Enter Event:");
            String check = in.next();
            for(BingoBoard boards:boardList)
            {
                boards.putMarker(check);
                boards.printBoard();
                if(winnerDetermined == false)
                    winnerDetermined = boards.checkWin();
                else
                    boards.checkWin();
            }
        }

        this.printWinner();

    }


    
    private void printWinner()
    {
        //Prints out winning boards. More than one player may win.
        for(BingoBoard boards:boardList)
        {
            if(boards.won())
                System.out.printf("Player %d wins!\n\n",boards.getPlayer());
        } 
    }

}