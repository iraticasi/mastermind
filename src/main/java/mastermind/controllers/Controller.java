package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public abstract class Controller {

    Game game;

    protected Controller(Game game) {
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
