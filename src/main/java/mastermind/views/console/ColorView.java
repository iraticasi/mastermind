package mastermind.views.console;

import mastermind.models.Color;
import mastermind.models.Pattern;

public class ColorView {

    public static String generateRegularExpresion() {
        String regexp = "";
        for (int i = 0; i < Color.values().length - 1; i++) {
            regexp += Color.values()[i].getCode() + "|";
        }
        regexp += Color.values()[Color.values().length - 1].getCode();
        regexp = "(" + regexp + "){" + Pattern.getPatternLength() + "}";
        return regexp;
    }

    public static String generateOptions(){
        String options = "";
        int length = Color.values().length;
        for (int i = 0; i < length - 1; i++) {
            options += Color.values()[i].getCode() + "-" + Color.values()[i].name().toLowerCase() + ", ";
        }
        options += Color.values()[length - 1].getCode()  + "-" + Color.values()[length-1].name().toLowerCase();;
        return options;
    }
}
