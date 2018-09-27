package mastermind.controllers.local;

import mastermind.controllers.ContinueController;
import mastermind.controllers.ControllerVisitor;
import mastermind.models.Game;
import mastermind.models.State;

public class LocalContinueController extends LocalController implements ContinueController {

    public LocalContinueController(Game game) {
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
