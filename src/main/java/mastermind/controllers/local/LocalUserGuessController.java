package mastermind.controllers.local;

import mastermind.controllers.GuessControllerVisitor;
import mastermind.controllers.UserGuessController;
import mastermind.models.Game;
import mastermind.models.Pattern;

public class LocalUserGuessController extends LocalGuessController implements UserGuessController {

    public LocalUserGuessController(Game game) {
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
