package mastermind.models;

public class Game {

    private State state;

    private Pattern secretPattern;

    private int attempts;

    private static final int MAX_ATTEMPTS = 10;

    public Game() {
        state = State.INITIAL;
        secretPattern = new Pattern();
        attempts = 0;
        secretPattern.random(false);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Feedback makeAGuess(Pattern guess) {
        attempts++;
        return secretPattern.compareTo(guess);
    }

    public int attemptsLeft() {
        return MAX_ATTEMPTS - attempts;
    }

    public void clear() {
        secretPattern.random(false);
        attempts = 0;

    }
}