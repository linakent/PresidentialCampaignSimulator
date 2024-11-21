import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int votes; // The number of votes that the player has. The player can only win if they earn 100 votes by the end.

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Presidential Campaign Simulator.");
        System.out.println("First, select a party from the following options: Democrat, Republican, or Independent.");
        String party = s.nextLine();

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
        System.out.println("Okay, you will be running as a " + party + ".");
        System.out.println("Let's start the campaign!");

        votes +- candidate.campaign(s);
        votes +- candidate.debate(s);
        votes +- candidate.fundraising(s);

        votes +- corruptionOption(s, votes);

        System.out.println("Campaign over! Total votes: " + votes);
        if (votes > 100) {
            System.out.println("Congratulations, you won the election! Good luck with your presidency!");
        }
        else if (votes >= 0) {
            System.out.println("Unfortunately, you did not win the election. Good luck next time.);
        }
        else {
            System.out.println("You were disqualified for your shameless corruption.");

    }
}
