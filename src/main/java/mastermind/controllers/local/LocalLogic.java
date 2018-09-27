package mastermind.controllers.local;

import mastermind.Logic;
import mastermind.controllers.Controller;
import mastermind.models.Game;

public class LocalLogic implements Logic {

    private Game game;

    private LocalStartController startController;

    private LocalContinueController continueController;


    public LocalLogic() {
        this.game = new Game();
        this.startController = new LocalStartController(game);
        this.continueController = new LocalContinueController(game);

    }

    public Controller getController() {
        switch (game.getState()) {
            case INITIAL:
                return startController;
            case IN_GAME:
                return startController.getGuessController();
            case FINAL:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
