import java.util.Scanner;

public class Republican extends Candidate {

    public int campaign (Scanner s){
        System.out.println("Choose a campaign strategy");
        System.out.println("Option 1: Lower taxes");
        System.out.println("Option 2: Strengthen military");
        System.out.println("Option 3: Economic growth");
        int choice = s.nextInt();
        int baseVotes = (choice == 1) ? 35 : (choice == 2) ? 30 : 25;
        return randomizeVotes(baseVotes);
    }
    public int debate (Scanner s){

    }
    public int fundraising (Scanner s){

    }
}
