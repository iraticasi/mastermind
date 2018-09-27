package mastermind.controllers.local;

import mastermind.controllers.ControllerVisitor;
import mastermind.controllers.StartController;
import mastermind.models.Game;
import mastermind.models.State;

public class LocalStartController extends LocalController implements StartController {

    private LocalGuessController localGuessController;

    public LocalStartController(Game game) {
        super(game);
    }

    public void start(boolean demo) {
        assert this.getState() == State.INITIAL;
        localGuessController = demo ? new LocalRandomGuessController(game) : new LocalUserGuessController(game);
        this.setState(State.IN_GAME);

    }

    public LocalGuessController getGuessController() {
        return localGuessController;
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
