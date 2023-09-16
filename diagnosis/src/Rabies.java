package diagnosis.diagnosis.src;

import java.util.Scanner;

public class Rabies extends Disease {

    private static final String[] rabiesSymptoms = {"Flu-like symptoms", "Hydrophobia", "Hallucinations"};
    public Rabies()
    {
        super("Rabies", rabiesSymptoms);
    }

    // Refer to the comment on main for information
    public static boolean checkForRabies() {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you experiencing hallucinations?");
        String hasHallucinations = input.nextLine();
        if (hasHallucinations.equals("yes")) {
            System.out.println("Does your throat burn when you drink water?");
            String hasHydrophobia = input.nextLine();
            if (hasHydrophobia.equals("yes")) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
