package mastermind.views;

import mastermind.controllers.*;
import mastermind.utils.OptionDialog;
import mastermind.utils.YesNoDialog;

public class View implements ControllerVisitor {

    private GuessView guessView;

    public View() {
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
