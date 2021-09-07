package bsu.comp152;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        var age = reader.nextInt();
        var dogYears = age*7;
        System.out.println("Wow " + age + " years old!");

        System.out.println("That's " + dogYears + " in dog years.");
    }
}
