import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rabies rabies = new Rabies();
        System.out.println("Do you have flu-like symptoms?");

        String hasFluLikeSymptoms = input.nextLine();

        if(hasFluLikeSymptoms.equals("yes"))
        {
            if(Rabies.checkForRabies())
            {
                System.out.println("You have rabies");
            } else if(bubonicPlague.checkForBubonicPlague()) {
                System.out.println("You have the plague");
            } else {
                System.out.println("Seek medical assistance");
            }
        } else {
            System.out.println("Seek medical assistance");
        }
    }
}
