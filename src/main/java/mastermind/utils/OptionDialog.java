package mastermind.utils;

public class OptionDialog {

    private String[] options;

    public OptionDialog(String[] options) {
        assert options != null;
        assert options.length > 0;
        this.options = options;
    }

    public int read() {
        int answer;
        IO io = new IO();
        boolean ok;
        for (int i = 0; i < options.length; i++) {
            io.writeln("" + (i + 1) + ". " + options[i]);
        }
        do {
            answer = io.readInt("Opción: ");
            ok = (0 < answer) && (answer <= options.length);
            if (!ok) {
                io.writeln("El valor debe ser entre 1 y " + options.length);
            }
        } while (!ok);
        return answer;
    }

}