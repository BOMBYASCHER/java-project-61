package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;

public class Calc {
    public static void calcGame() {
        String username = getName();
        byte i = 0;
        while (i < gameRounds) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            String expression = "";
            String correctAnswer = "";
            String userAnswer;
            int key = (byte) (Math.random() * 3);
            if (key == 2) {
                secondNumber = (int) (Math.random() * 10);
            }
            switch (key) {
                case 0 -> {
                    expression = firstNumber + " + " + secondNumber;
                    correctAnswer = String.valueOf(firstNumber + secondNumber);
                }
                case 1 -> {
                    expression = firstNumber + " - " + secondNumber;
                    correctAnswer = String.valueOf(firstNumber - secondNumber);
                }
                case 2 -> {
                    expression = firstNumber + " * " + secondNumber;
                    correctAnswer = String.valueOf(firstNumber * secondNumber);
                }
                default -> {
                }
            }
            questionMessage(expression);
            userAnswer = userEnter();
            if (correctAnswer.equals(userAnswer)) {
                passMessage();
                i++;
            } else {
                stopMessage(userAnswer, correctAnswer, username);
                break;
            }
        }
        if (i == gameRounds) {
            congratsMessage(username);
        }
    }
}
