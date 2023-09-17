package diagnosis.diagnosis.src;

import java.util.Scanner;

public class bubonicPlague extends Disease{
    private static final String[] bubPlagueSymptoms = {"Flu-like symptoms", "Buboes"};

    public bubonicPlague()
    {
        super("Bubonic Plague", bubPlagueSymptoms);
    }

    // Refer to the comment on main for information
    public static boolean checkForBubonicPlague()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you developing " + bubPlagueSymptoms[1] + " or swollen lymph nodes");
        String hasBuboes = input.nextLine();
        if(hasBuboes.equals("yes"))
        {
            return true;
        }
        return false;
    }

}
