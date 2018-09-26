package mastermind.controllers;

import mastermind.models.Feedback;
import mastermind.models.Game;
import mastermind.models.Pattern;
import mastermind.models.State;

public abstract class GuessController extends Controller {

    public GuessController(Game game) {
        super(game);
    }

    public Feedback makeAGuess(Pattern pattern) {
        assert pattern != null;
        Feedback feedback = game.makeAGuess(pattern);
        if (feedback.isAMatch() || game.attemptsLeft() == 0) {
            game.setState(State.FINAL);
        }
        return feedback;
    }

    public abstract Pattern getPattern();

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public abstract void accept(GuessControllerVisitor guessControllerVisitor);


}
