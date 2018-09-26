package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.views.View;

public class Mastermind {

    private Logic logic;

    private View view;

    public Mastermind() {
        this.logic = new Logic();
        this.view = new View();
    }

    public void play() {
        Controller controller;
        do {
            controller = logic.getController();
            if (controller != null) {
                view.interact(controller);
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
