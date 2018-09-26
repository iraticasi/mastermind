package mastermind.controllers;

public interface ControllerVisitor {

    void visit(StartController startController);

    void visit(GuessController guessController);

    void visit(ContinueController continueController);

}
