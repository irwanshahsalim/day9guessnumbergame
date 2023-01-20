package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNumber = rand.nextInt(1, 100);
        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);
         while (myGuess != guessNumber) {

            if (myGuess < guessNumber){
                System.out.println("The number is higher");
            } else if (myGuess > guessNumber) {
                System.out.println("The number is lower");
            } else {
                System.out.println("You got it right!");
                input.close();
                System.exit(0);
            }
        }


    }
}
