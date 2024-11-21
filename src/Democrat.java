import java.util.Scanner;

public class Democrat extends Candidate {

    public int campaign (Scanner s){
        System.out.println("Choose a campaign strategy by entering the corresponding number:");
        System.out.println("Option 1: Focus on climate change");
        System.out.println("Option 2: Social justice reform");
        System.out.println("Option 3: Improvements in education");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 30 : (choice == 2) ? 20 : 25;
        return randomizeVotes(baseVotes);
    }

    public int debate (Scanner s){
        System.out.println("Choose a debate focus:");
        System.out.println("Option 1: Healthcare reform");
        System.out.println("Option 2: Immigration policy");
        System.out.println("Option 3: Economic equality");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 25 : (choice == 2) ? 15 : 20;
        return randomizeVotes(baseVotes);
    }
    public int fundraising (Scanner s){
        System.out.println("Choose a fundraising approach:");
        System.out.println("Option 1: Grassroots donations");
        System.out.println("Option 2: Corporate sponsors");
        System.out.println("Option 3: Celebrity endorsements");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 20 : (choice == 2) ? 30 : 25;
        return randomizeVotes(baseVotes);
    }

}
