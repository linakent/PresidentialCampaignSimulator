import java.util.Scanner;

public class Independent extends Candidate {

    public int campaign (Scanner s){
        System.out.println("Choose a campaign strategy:");
        System.out.println("Option 1: Bipartisan cooperation");
        System.out.println("Option 2: Community engagement");
        System.out.println("Option 3: Reducing partisanship");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 25 : (choice == 2) ? 20 : 30;
        return randomizeVotes(baseVotes);
    }

    public int debate (Scanner s){
        System.out.println("Choose a debate focus:");
        System.out.println("Option 1: Unity and compromise");
        System.out.println("Option 2: Anti-corruption measures");
        System.out.println("Option 3: Social welfare");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 25 : (choice == 2) ? 30 : 20;
        return randomizeVotes(baseVotes);
    }
    public int fundraising (Scanner s){
        System.out.println("Choose a fundraising approach:");
        System.out.println("Option 1: Local donations");
        System.out.println("Option 2: Crowdfunding");
        System.out.println("Option 3: Social media campaigns");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 15 : (choice == 2) ? 25 : 20;
        return randomizeVotes(baseVotes);
    }

}

