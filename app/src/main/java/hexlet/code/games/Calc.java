package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.getGameRounds;
import static hexlet.code.Engine.randomNumber;

public class Calc {
    public static void calcGame() {
        String username = getName();
        System.out.println("What is the result of the expression?");
        byte i = 0;
        final int maxNumber = 100;
        final int maxMultiplication = 10;

        while (i < getGameRounds()) {
            int firstNumber = randomNumber(maxNumber);
            int secondNumber = randomNumber(maxNumber);
            String expression = "";
            String correctAnswer = "";
            String userAnswer;
            int key = randomNumber(0, 2);
            if (key == 2) {
                secondNumber = randomNumber(maxMultiplication);
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
        if (i == getGameRounds()) {
            congratsMessage(username);
        }
    }
}
