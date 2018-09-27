package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;

public interface View extends ControllerVisitor {

    public void interact(Controller controller);
}
