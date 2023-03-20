package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;
import static hexlet.code.Engine.randomNumber;

public class Calc {
    public static void calcGame() {
        String username = getName();
        System.out.println("What is the result of the expression?");
        byte i = 0;
        while (i < gameRounds) {
            int firstNumber = randomNumber(100);
            int secondNumber = randomNumber(100);
            String expression = "";
            String correctAnswer = "";
            String userAnswer;
            int key = randomNumber(3);
            if (key == 2) {
                secondNumber = randomNumber(10);
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
