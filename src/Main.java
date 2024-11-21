import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int votes = 0; // The number of votes that the player has. The player can only win if they earn 100 votes by the end.

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Presidential Campaign Simulator.");
        System.out.println("First, select a party from the following options: Democrat, Republican, or Independent.");
        String party = s.nextLine();

        Candidate candidate;
        if (party.equalsIgnoreCase("Democrat")) {
            candidate = new Democrat();
        } else if (party.equalsIgnoreCase("Republican")) {
            candidate = new Republican();
        } else {
            candidate = new Independent();
        }
        System.out.println("Okay, you will be running as a " + party + ".");
        System.out.println("Let's start the campaign!");

        votes += candidate.campaign(s);
        votes += candidate.debate(s);
        votes += candidate.fundraising(s);

        votes += corruptionOption(s, votes);

        System.out.println("Campaign over! Total votes: " + votes);
        if (votes > 100) {
            System.out.println("Congratulations, you won the election! Good luck with your presidency!");
        } else if (votes >= 0) {
            System.out.println("Unfortunately, you did not win the election. Good luck next time.");
        } else {
            System.out.println("You were disqualified for your shameless corruption.");

        }
    }

    public static int corruptionOption(Scanner s, int currentVotes) {
        System.out.println("Do you want to attempt to use corruption?");
        String choice = s.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("You chose to engage in corruption.");
            double chance = Math.random();
            if (chance < 0.3) {
                System.out.println("You succeeded in bribery. You gained 50 votes.");
                return 50;
            } else if (chance >= 0.3) {
                System.out.println("You got caught. You lost all of your votes and are now disqualified.");
                return -currentVotes;

            }
            else {
                System.out.println("You chose to avoid corruption.");
                return 0;
            }
        }
        return currentVotes;
    }
}
