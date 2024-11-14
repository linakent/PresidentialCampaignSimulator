import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int votes;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Presidential Campaign Simulator.");
        System.out.println("First, select a party from the following options: Democrat, Republican, or Independent.");
        String party = s.nextLine();

        System.out.println("Okay, you will be running as a " + party + ".");

        Candidate candidate;
        if (party.equalsIgnoreCase("Democrat")){
            candidate = new Democrat();
        }
        else if (party.equalsIgnoreCase("Republican")){
            candidate = new Republican();
        }
        else {
            candidate = new Independent();
    }




    }
}