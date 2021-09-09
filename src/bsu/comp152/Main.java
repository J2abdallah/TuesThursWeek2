package bsu.comp152;

import java.util.ArrayList;
import java.util.Scanner;

/*public class Main {

    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        var age = reader.nextInt();
        var dogYears = age*7;
        System.out.println("Wow " + age + " years old!");

        System.out.println("That's " + dogYears + " in dog years.");
    }


}
 */
public class Main{
    public static void main(String[]Args){
        var ClassNames = new ArrayList<String>();
        var reader = new Scanner(System.in);

        System.out.println("Enter you and your classmates names below. Type \"Done\" to finish");
        var name = " ";
        while(true){
            name = reader.nextLine();
            if(name.equals("Done")){
                break;
            }
            ClassNames.add(name);
        }
       // System.out.println("the list of names in your class is "+ClassNames);
        System.out.println("the list of names in your class is ");
        for (var Name:ClassNames){
            System.out.println(Name);
        }
    }
}