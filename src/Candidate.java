import java.util.Scanner;

abstract class Candidate {

    public abstract int campaign (Scanner s);
    public abstract int debate (Scanner s);
    public abstract int fundraising (Scanner s);
    // Each party has its own methods of running the campaign, debate, and fundraising. By making Candidate an abstract class, it allows the other parties to extend it.
}
