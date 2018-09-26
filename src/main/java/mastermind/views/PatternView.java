package mastermind.views;

import mastermind.models.Color;
import mastermind.models.Pattern;
import mastermind.utils.IO;

public class PatternView {

    private Pattern pattern;

    private IO io;

    PatternView(Pattern pattern) {
        assert pattern != null;

        this.pattern = pattern;
        io = new IO();
    }

    void read() {
        String answer;
        boolean ok;
        String regexp = "";
        for (int i = 0; i < Color.values().length - 1; i++) {
            regexp += Color.values()[i].name() + "|";
        }
        regexp += Color.values()[Color.values().length - 1].name();
        regexp = "(" + regexp + "){" + pattern.getPatternLength() + "}";
        do {
            answer = io.readString("Intento: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro] ");
            ok = answer.matches(regexp);
            if (!ok) {
                io.writeln("Mal formato'");
            }
        } while (!ok);
        String[] splitAnswer = answer.split("(?!^)");
        Color[] colors = new Color[pattern.getPatternLength()];
        for (int i = 0; i < pattern.getPatternLength(); i++) {
            colors[i] = Color.valueOf(splitAnswer[i]);
        }
        pattern.setColors(colors);
    }

    void write() {
        io.write("Intento: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro] ");
        io.write(this.toString());
    }

    void writeln() {
        this.write();
        io.writeln();
    }


    @Override
    public String toString() {
        String string = "";
        for (Color color : pattern.getColors()) {
            string += color.name();
        }
        return string;
    }

}