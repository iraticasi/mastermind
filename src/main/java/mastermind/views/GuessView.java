package mastermind.views;

import mastermind.controllers.GuessController;
import mastermind.controllers.GuessControllerVisitor;
import mastermind.controllers.RandomGuessController;
import mastermind.controllers.UserGuessController;
import mastermind.models.Pattern;

public class GuessView implements GuessControllerVisitor {


    private Pattern pattern;

    public Pattern getPattern() {
        return pattern;
    }

    public void interact(GuessController guessController) {
        assert guessController != null;
        guessController.accept(this);
        new FeedbackView(guessController.makeAGuess(pattern)).writeln();
    }

    @Override
    public void visit(RandomGuessController randomGuessController) {
        pattern = randomGuessController.getPattern();
        new PatternView(pattern).writeln();
    }

    @Override
    public void visit(UserGuessController userGuessController) {
        pattern = userGuessController.getPattern();
        new PatternView(pattern).read();
    }
}
