package mastermind.views.console;

import mastermind.models.Color;
import mastermind.models.Pattern;
import mastermind.utils.IO;

public class PatternView {

    private Pattern pattern;

    private IO io;

    private String text;

    PatternView(Pattern pattern) {
        assert pattern != null;
        this.pattern = pattern;
        this.text = "Intento: ["+Pattern.getPatternLength()+" letras de entre" + ColorView.generateOptions()+ "] ";
        io = new IO();
    }

    public void read() {
        String answer;
        boolean ok;
        do {
            answer = io.readString(text);
            ok = answer.matches(ColorView.generateRegularExpresion());
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


    public void write() {
        io.write(text);
        io.write(this.toString());
    }

    public void writeln() {
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