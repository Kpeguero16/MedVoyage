package diagnosis.diagnosis.src;

import java.util.Scanner;

public class Ebola extends Disease {
    private static final String[] ebolaSymptoms = {"Flu-like symptoms", "Loss of appetite", "Gastrointestinal symptoms", "Unexplained hemorrhaging, bleeding, or bruising"};
    public Ebola(String name, String[] symptoms) {
        super(name, symptoms);

    }

    // Refer to the comment on main for information
    public static boolean checkForEbola(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have " + ebolaSymptoms[2] + " ?");
        String hasGastroSymp = input.nextLine();
        if (hasGastroSymp.equals("yes")){
            System.out.println("Have you had diarrhea?");
            String diarrhea = input.nextLine();
            if (diarrhea.equals("yes")){
                System.out.println("Have you had unexplained bleeding?");
                String bleeding = input.nextLine();
                if (bleeding.equals("yes")){
                    return true;
                }
            }
        }

        return false;
    }
}

