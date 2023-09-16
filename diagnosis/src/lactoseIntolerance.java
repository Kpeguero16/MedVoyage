package diagnosis.diagnosis.src;

import java.util.Scanner;
public class lactoseIntolerance extends Disease{
    private static final String[] lactoseSymptoms = {"Gastrointestinal Pain", "Diarrhea"};

    public lactoseIntolerance()
    {
        super("Lactose Intolerance", lactoseSymptoms);
    }

    // Refer to the comment on main for information
    public static boolean checkForLactoseIntolerance()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you feel " + lactoseSymptoms[0] + "?");
        String hasPain = input.nextLine();

        if(hasPain.equals("yes"))
        {
            System.out.println("Did you consume a dairy product?");
            String drankLactose = input.nextLine();
            if (drankLactose.equals("yes"))
            {
                return true;
            }
        }
        return false;
    }
}
