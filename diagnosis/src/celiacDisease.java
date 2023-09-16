package diagnosis.diagnosis.src;
import java.util.Scanner;
public class celiacDisease extends Disease{
    private static final String[] celiacSymptoms = {"Gastrointestinal Pain", "Diarrhea"};

    public celiacDisease() {
        super("Celiac Disease", celiacSymptoms);
    }

    public static boolean checkForCeliacDisease()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Have you eaten any grain products?");
        String eatenGrain = input.nextLine();
        if(eatenGrain.equals("yes"))
        {
            return true;
        }

        return false;
    }
}
