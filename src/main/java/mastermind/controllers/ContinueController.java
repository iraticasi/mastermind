package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ContinueController extends Controller {

    public ContinueController(Game game) {
        super(game);
    }


    public void setContinue(boolean another) {
        assert this.getState() == State.FINAL;
        if (another) {
            this.clear();
            this.setState(State.INITIAL);
        } else {
            this.setState(State.EXIT);
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
