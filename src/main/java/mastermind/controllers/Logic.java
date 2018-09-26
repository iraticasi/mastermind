package mastermind.controllers;

import mastermind.models.Game;

public class Logic {

    private Game game;

    private StartController startController;

    private ContinueController continueController;


    public Logic() {
        this.game = new Game();
        this.startController = new StartController(game);
        this.continueController = new ContinueController(game);

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
