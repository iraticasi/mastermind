package mastermind.views.console;

import mastermind.models.Feedback;
import mastermind.utils.IO;

public class FeedbackView {

    private Feedback feedback;

    private IO io;

    FeedbackView(Feedback feedback) {
        this.feedback = feedback;
        io = new IO();
    }

    public void write(){
        io.write(this.toString());
    }
    public void writeln() {
        this.write();
        io.writeln();
    }

    @Override
    public String toString() {
        if (feedback.isAMatch()) return "4 MUERTOS! VICTORIA!";
        return "" + feedback.getBlackPegs() + " muertos y " + feedback.getWhitePegs() + " heridos";
    }
}
