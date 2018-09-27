package mastermind.controllers;

public interface Controller {

    void accept(ControllerVisitor controllerVisitor);

}
