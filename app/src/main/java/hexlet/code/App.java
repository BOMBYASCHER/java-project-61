package hexlet.code;

import static hexlet.code.Cli.start;
import static hexlet.code.Cli.getName;
import static hexlet.code.Even.evenGame;

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
            default:
        }
    }
}
