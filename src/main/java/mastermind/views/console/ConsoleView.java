package mastermind.views.console;

import mastermind.View;
import mastermind.controllers.ContinueController;
import mastermind.controllers.Controller;
import mastermind.controllers.GuessController;
import mastermind.controllers.StartController;
import mastermind.utils.OptionDialog;
import mastermind.utils.YesNoDialog;

public class ConsoleView implements View {

    private GuessView guessView;

    public ConsoleView() {
        guessView = new GuessView();
    }

    public void interact(Controller controller) {
        assert controller != null;
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        boolean demo = (new OptionDialog(new String[]{"Partida", "Demo"}).read() == 2);
        startController.start(demo);
    }

    @Override
    public void visit(GuessController guessController) {
        guessView.interact(guessController);
    }

    @Override
    public void visit(ContinueController continueController) {
        continueController.setContinue(new YesNoDialog("Desea continuar").read());
    }
}
