import java.util.Scanner;

public class Republican extends Candidate {
int votes = 0;
    public int campaign (Scanner s){
        System.out.println("Choose a campaign strategy:");
        System.out.println("Option 1: Lower taxes");
        System.out.println("Option 2: Strong military");
        System.out.println("Option 3: Economic growth");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 35 : (choice == 2) ? 30 : 25;
        return randomizeVotes(baseVotes);
    }

    public int debate (Scanner s){
        System.out.println("Choose a debate focus:");
        System.out.println("Option 1: Border security");
        System.out.println("Option 2: Free market policies");
        System.out.println("Option 3: National security");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 30 : (choice == 2) ? 20 : 25;
        return randomizeVotes(baseVotes);
    }
    public int fundraising (Scanner s){
        System.out.println("Choose a fundraising approach:");
        System.out.println("Option 1: High-dollar donors");
        System.out.println("Option 2: Corporate sponsors");
        System.out.println("Option 3: Local events");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 25 : (choice == 2) ? 30 : 15;
        return randomizeVotes(baseVotes);
    }

}
