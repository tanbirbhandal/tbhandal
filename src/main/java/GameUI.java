import java.util.Scanner;

public class GameUI {
    private final GameEngine engine;
    private final Scanner scanner;

    public GameUI(GameEngine engine, Scanner scanner) {
        this.engine = engine;
        this.scanner = scanner;
    }

    public void start() {
        while (!engine.isGameWon() && !engine.isGameOver()) {
            System.out.print("Guess a number between " + engine.getMin() + " and " + engine.getMax() + ": ");
            int guess = Utils.readInt(scanner);

            GuessResult result = engine.makeGuess(guess);
            System.out.println(result.getMessage());
        }
    }
}
