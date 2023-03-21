package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.getGameRounds;
import static hexlet.code.Engine.randomNumber;
public class GCD {
    static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGcd(secondNumber, firstNumber % secondNumber);
    }
    public static void gcdGame() {
        String username = getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        String correctAnswer;
        byte i = 0;
        int maxRandomNumber = 100;
        while (i < getGameRounds()) {
            String expression;
            String userAnswer;
            int firstNumber = randomNumber(maxRandomNumber);
            int secondNumber = randomNumber(maxRandomNumber);
            int maxNumber = Math.max(firstNumber, secondNumber);
            if (firstNumber == 0 || secondNumber == 0) {
                correctAnswer = String.valueOf(maxNumber);
            } else {
                correctAnswer = String.valueOf(getGcd(firstNumber, secondNumber));
            }
            expression = firstNumber + " " + secondNumber;
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
