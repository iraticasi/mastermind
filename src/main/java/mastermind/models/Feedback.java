package mastermind.models;

public class Feedback {

    private int blackPegs;

    private int whitePegs;

    public Feedback(int blackPegs, int whitePegs) {
        this.blackPegs = blackPegs;
        this.whitePegs = whitePegs;
    }

    public int getBlackPegs() {
        return blackPegs;
    }

    public int getWhitePegs() {
        return whitePegs;
    }

    public boolean isAMatch() {
        return blackPegs == 4;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "blackPegs=" + blackPegs +
                ", whitePegs=" + whitePegs +
                '}';
    }

}
