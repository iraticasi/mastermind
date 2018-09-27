package mastermind.controllers;

import mastermind.models.Feedback;
import mastermind.models.Pattern;

public interface GuessController extends Controller {

    Feedback makeAGuess(Pattern pattern);

    Pattern getPattern();

    void accept(GuessControllerVisitor guessControllerVisitor);
}
