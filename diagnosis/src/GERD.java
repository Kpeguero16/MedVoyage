package diagnosis.diagnosis.src;
import java.util.Scanner;
public class GERD extends Disease{
    private static final String[] gerdSymptoms = {"Chest Pain", "Cough", "Regurgitation"};

    public GERD(String name, String[] symptoms) {
        super(name, gerdSymptoms);
    }

    // Refer to the comment on main for information
    public static boolean checkForGERD()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you feel " + gerdSymptoms[2] + " or backwash of food?");
        String hasRegurgitation = input.nextLine();
        if(hasRegurgitation.equals("yes"))
        {
            return true;
        }

        return false;
    }
}
