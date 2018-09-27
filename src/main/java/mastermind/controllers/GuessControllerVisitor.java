package mastermind.controllers;


public interface GuessControllerVisitor {

    void visit(RandomGuessController randomGuessController);

    void visit(UserGuessController userGuessController);

}
