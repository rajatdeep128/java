package hangmanGame;

import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"horse", "tiger", "bear", "mouse", "donkey", "Lion", "monkey", "leopard", "wolf", "buffalo", "sparrow", };
        String word = words[(int) (Math.random() * words.length)];
        String asterisk = new String(new char[word.length()]).replace("\0", "*");
        int count = 0;

        while (count < 8 && asterisk.contains("*")) {
            System.out.println("Guess a letter:");
            System.out.println(asterisk);
            String guess = scanner.next();
            if (guess.length() != 1) {
                System.out.println("Please enter a single letter.");
            } else {
                count++;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)) {
                        asterisk = asterisk.substring(0, i) + guess.charAt(0) + asterisk.substring(i + 1);
                    }
                }
            }
        }
        scanner.close();

        if (asterisk.contains("*")) {
            System.out.println("Sorry, you ran out of guesses. The word was " + word + ".");
        } else {
            System.out.println("Congratulations! You guessed the word " + word + " with " + count + " guesses.");
        }
    }
}
