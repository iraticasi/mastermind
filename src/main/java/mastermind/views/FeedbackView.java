package mastermind.views;

import mastermind.models.Feedback;
import mastermind.utils.IO;

public class FeedbackView {

    private Feedback feedback;

    private IO io;

    FeedbackView(Feedback feedback) {
        this.feedback = feedback;
        io = new IO();
    }

    void writeln() {
        io.writeln(this.toString());
    }

    @Override
    public String toString() {
        if (feedback.isAMatch()) return "4 MUERTOS! VICTORIA!";
        return "" + feedback.getBlackPegs() + " muertos y " + feedback.getWhitePegs() + " heridos";
    }
}
