package mastermind.models;

public enum Color {
    AMARILLO("A"),
    ROJO("R"),
    VERDE("V"),
    AZUL("Z"),
    BLANCO("B"),
    NEGRO("N");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}