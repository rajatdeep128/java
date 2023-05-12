package numberGuessingGame;

import java.util.Scanner;

public class NGG {

	 public static void
	    guessingNumberGame()
	    {
	        // Scanner Class
	        Scanner sc = new Scanner(System.in);
	 
	        // Generate the numbers
	        int number = 1 + (int)(200 * Math.random());
	 
	        // Given K trials
	        int K = 8;
	 
	        int i, guess;
	 
	        System.out.println(
	            "A number is chosen"
	            + " between 1 to 200. "
	            + "Guess the number"
	            + " within 8 trials.");
	        int tryCount = 0;
	        // Iterate over K Trials
	        for (i = 0; i < K; i++) {
	 
	            System.out.println(
	                "Guess the number:");
	 
	            // Take input for guessing
	            guess = sc.nextInt();
	 
                tryCount++;
	            // If the number is guessed
	            if (number == guess) {
	                System.out.println(
	                    "Congratulations!"
	                    + " You guessed the number.");
	                System.out.println("It took you " + tryCount + " tries");
	                break;
	            }
	            else if (number > guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is "
	                    + "greater than " + guess);
	            }
	            else if (number < guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is"
	                    + " less than " + guess);
	            }
	        }
	 
	        if (i == K) {
	            System.out.println(
	                "You have exhausted"
	                + " 8 trials.");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	    }
	 
	    // Driver Code
	    public static void
	    main(String arg[])
	    {
	 
	        // Function Call
	        guessingNumberGame();
	    }
	}
