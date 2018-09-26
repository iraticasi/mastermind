package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.Pattern;

public class UserGuessController extends GuessController {

    public UserGuessController(Game game) {
        super(game);
    }

    @Override
    public Pattern getPattern() {
        return new Pattern();
    }

    @Override
    public void accept(GuessControllerVisitor guessControllerVisitor) {
        guessControllerVisitor.visit(this);
    }

}
