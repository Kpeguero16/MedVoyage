package diagnosis.diagnosis.src;
import java.util.Scanner;
public class Angina extends Disease{
    private static final String[] anginaSymptoms = {"Chest Pain", "Dizziness", "Nausea", "Shortness of Breath"};

    public Angina() {
        super("Angina", anginaSymptoms);
    }

    // Refer to the comment on main for information
    public static boolean checkForAngina()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you feel " + anginaSymptoms[3]);
        String hasBreathProblems = input.nextLine();
        if(hasBreathProblems.equals("yes"))
        {
            return true;
        }

        return false;
    }
}
