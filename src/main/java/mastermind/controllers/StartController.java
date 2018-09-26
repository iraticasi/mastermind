package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class StartController extends Controller {

    private GuessController guessController;

    public StartController(Game game) {
        super(game);
    }

    public void start(boolean demo) {
        assert this.getState() == State.INITIAL;
        guessController = demo ? new RandomGuessController(game) : new UserGuessController(game);
        this.setState(State.IN_GAME);

    }

    public GuessController getGuessController() {
        return guessController;
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
