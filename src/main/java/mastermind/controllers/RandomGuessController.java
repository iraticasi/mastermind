package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.Pattern;

public class RandomGuessController extends GuessController {

    public RandomGuessController(Game game) {
        super(game);
    }

    @Override
    public Pattern getPattern() {
        Pattern pattern = new Pattern();
        pattern.random(true);
        return pattern;
    }

    @Override
    public void accept(GuessControllerVisitor guessControllerVisitor) {
        guessControllerVisitor.visit(this);
    }

}
