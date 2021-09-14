import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[]Args){
        var numberGen = new Random();
        var hiddenNum = numberGen.nextInt(10)+1;
        var commandLineReader = new Scanner(System.in);
        var guess = 0;

        while (true) {
            System.out.println("enter a number 1-10");
            guess = commandLineReader.nextInt();
            if (hiddenNum == guess)
                break;
            System.out.println("you were incorrect " + guess + " was not the number");
        }
        System.out.println("You are correct! "+ hiddenNum + " is the hidden number.");
    }
}
