package hexlet.code;

import static hexlet.code.Cli.start;
import static hexlet.code.Cli.getName;
import static hexlet.code.games.Even.evenGame;
import static hexlet.code.games.Calc.calcGame;
import static hexlet.code.games.GCD.gcdGame;
import static hexlet.code.games.Progression.progressionGame;

public class App {
    public static void main(String[] args) {
        switch (start()) {
            case "0":
                break;
            case "1":
                getName();
                break;
            case "2":
                evenGame();
                break;
            case "3":
                calcGame();
                break;
            case "4":
                gcdGame();
                break;
            case "5":
                progressionGame();
                break;
            default:
        }
    }
}
