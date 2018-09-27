package mastermind.controllers.local;

import mastermind.controllers.GuessControllerVisitor;
import mastermind.controllers.RandomGuessController;
import mastermind.models.Game;
import mastermind.models.Pattern;

public class LocalRandomGuessController extends LocalGuessController implements RandomGuessController {

    public LocalRandomGuessController(Game game) {
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
