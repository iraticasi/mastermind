package mastermind.controllers.local;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;
import mastermind.models.Game;
import mastermind.models.State;

public abstract class LocalController implements Controller {

    Game game;

    protected LocalController(Game game) {
        assert game != null;
        this.game = game;
    }

    protected State getState() {
        return game.getState();
    }

    protected void setState(State state) {
        assert state != null;
        game.setState(state);
    }

    protected void clear() {
        game.clear();
    }

    public abstract void accept(ControllerVisitor controllerVisitor);
}
