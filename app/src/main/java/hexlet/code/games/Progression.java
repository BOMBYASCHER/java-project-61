package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;
import static hexlet.code.Engine.randomNumber;

public class Progression {

    public static StringBuilder generateProgression(int lengthOfProgression, int correctAnswer) {
        int step = randomNumber(1, 10);
        int positionOfNumber = randomNumber(1, lengthOfProgression);
        StringBuilder expression = new StringBuilder();
        for (byte j = 1; j < positionOfNumber; j++) {
            expression.append(correctAnswer - step * (positionOfNumber - j));
            expression.append(" ");
        }
        expression.append(".. ");
        for (byte j = 0; j < lengthOfProgression - positionOfNumber; j++) {
            expression.append(correctAnswer + step * (j + 1));
            expression.append(" ");
        }
        return expression;
    }

    public static void progressionGame() {
        String username = getName();
        System.out.println("What number is missing in the progression?");
        int lengthOfProgression = 10;
        byte i = 0;
        while (i < gameRounds) {
            int correctAnswer = randomNumber(-100, 100);
            questionMessage(String.valueOf(generateProgression(lengthOfProgression, correctAnswer)));
            String userAnswer = userEnter();
            if (userAnswer.equals(String.valueOf(correctAnswer))) {
                passMessage();
                i++;
            } else {
                stopMessage(userAnswer, String.valueOf(correctAnswer), username);
                break;
            }
        }
        if (i == gameRounds) {
            congratsMessage(username);
        }
    }
}
