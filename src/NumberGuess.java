import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[]Args){
        var numberGen = new Random();
        var hiddenNum = numberGen.nextInt(10)+1;
        var commandLineReader = new Scanner(System.in);
        var guess = commandLineReader.nextInt();
        System.out.println("enter a number 1-10");
        if(hiddenNum == guess)
            System.out.println("you guessed correctly, "+ hiddenNum + " was the hidden number");
        else
            System.out.println("you were incorrect " + guess + " was not the number");
    }
}
