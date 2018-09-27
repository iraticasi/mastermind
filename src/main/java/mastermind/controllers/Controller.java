package mastermind.controllers;

public interface Controller {

    public void accept(ControllerVisitor controllerVisitor);

}
