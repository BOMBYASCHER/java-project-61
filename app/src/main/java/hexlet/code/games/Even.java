package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;
public class Even {
    public static void evenGame() {
        String username = getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        byte i = 0;
        String correctAnswer;
        while (i < gameRounds) {
            byte number = (byte) (Math.random() * 100);
            questionMessage(String.valueOf(number));
            String userAnswer = userEnter();
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (number % 2 == 0 && userAnswer.equals("yes")) {
                passMessage();
                i++;
            }
            if (number % 2 != 0 && userAnswer.equals("no")) {
                passMessage();
                i++;
            }
            if (!userAnswer.equals(correctAnswer)) {
                stopMessage(userAnswer, correctAnswer, username);
                break;
            }
        }
        if (gameRounds == i) {
            congratsMessage(username);
        }

    }
}
