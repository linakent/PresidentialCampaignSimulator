import java.util.Scanner;

/** The Candidate Class represents the player and is where the parties extend from.
 */
abstract class Candidate {

    protected int randomizeVotes(int baseVotes) {
        int adjustment = (int)(Math.random() * 11) - 5;
        return baseVotes + adjustment;
    }
    public abstract int campaign (Scanner s);
    public abstract int debate (Scanner s);
    public abstract int fundraising (Scanner s);

    // Each party has its own methods of running the campaign, debate, and fundraising. By making Candidate an abstract class, it allows the other parties to extend it.
}
