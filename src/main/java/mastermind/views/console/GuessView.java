package mastermind.views.console;

import mastermind.controllers.GuessController;
import mastermind.controllers.GuessControllerVisitor;
import mastermind.controllers.RandomGuessController;
import mastermind.controllers.UserGuessController;
import mastermind.models.Pattern;

public class GuessView implements GuessControllerVisitor {


    private PatternView patternView;


    public void interact(GuessController guessController) {
        assert guessController != null;
        Pattern pattern = guessController.getPattern();
        patternView = new PatternView(pattern);
        guessController.accept(this);
        new FeedbackView(guessController.makeAGuess(pattern)).writeln();
    }

    @Override
    public void visit(RandomGuessController randomGuessController) {
        patternView.writeln();
    }

    @Override
    public void visit(UserGuessController userGuessController) {
        patternView.read();
    }
}
