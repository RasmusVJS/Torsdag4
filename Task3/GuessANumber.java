import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            if (scanner.nextDouble() == rnd_number){
                System.out.println("You guessed correctly!");
            }
            else if (scanner.nextDouble() > rnd_number){
                System.out.println("Your guess was too high, try again");
                makeAGuess();
            }
            else if (scanner.nextDouble() < rnd_number){
                System.out.println("Your guess was too low, try again");
                makeAGuess();
            }
            else{
                System.out.println("Not a number, try again");
                makeAGuess();
            }
        }
    }
}

