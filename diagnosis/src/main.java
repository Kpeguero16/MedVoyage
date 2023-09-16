package diagnosis.diagnosis.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the scanner in the main function
        Scanner input = new Scanner(System.in);
        /*
            How the program will function.
            1. The program will ask the user a question
            2. The program will store the input into a variable
            3. The variable is used to run an if statement.
            4. Repeat
            5. At the end of this loop, the function will return a diagnosis.
         */

        System.out.println("Do you have flu-like symptoms?");


        String hasFluLikeSymptoms = input.nextLine();

        if(hasFluLikeSymptoms.equals("yes"))
        {
            if(Rabies.checkForRabies())
            {
                System.out.println("You have rabies");
            } else if(bubonicPlague.checkForBubonicPlague()) {
                System.out.println("You have the plague");
            } else if(Ebola.checkForEbola()) {
                System.out.println("You have Ebola.");
            } else {
                System.out.println("You have the flu");
            }
        } else {
            System.out.println("Do you feel gastrointestinal pain?");
            String hasGastroPain = input.nextLine();
            if(hasGastroPain.equals("Yes"))
            {
                if(lactoseIntolerance.checkForLactoseIntolerance()) {
                    System.out.println("You have lactose Intolerance");
                } else if(celiacDisease.checkForCeliacDisease()){
                    System.out.println("You have celiac disease");
                } else {
                    System.out.println("Seek medical assistance");
                }
            } else {
                System.out.println("Seek medical assistance");
            }
        }
    }
}
