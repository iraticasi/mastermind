package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.local.LocalLogic;
import mastermind.views.console.ConsoleView;

public class Mastermind {

    private Logic logic;

    private View view;

    public Mastermind(Logic logic, View view) {
        this.logic = logic;
        this.view = view;
    }

    public static void main(String[] args) {
        new Mastermind(new LocalLogic(), new ConsoleView()).play();
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
}
