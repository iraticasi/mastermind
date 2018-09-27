package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;

public interface View extends ControllerVisitor {

    void interact(Controller controller);
}
