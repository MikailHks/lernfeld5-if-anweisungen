package calculator;
public class Calculator {

    public String calculate(double number1, double number2, char operator) {
        double result;

        if (operator == '+') {
            result = number1+ number2;
            return number1 + " + " + number2 +  " = " + result;
        }
        else if (operator == '-') {
            result = number1 - number2;
            return number1 + " - " + number2 + " = " + result;
        }
        else if (operator == '/') {
            result = number1 / number2;

            if (number2 == 0) {
                return"Division durch 0 nicht möglich!";
            }

            return number1 + " : " + number2 + " = " + result;
        }
        else if (operator == '*') {
            result = number1 * number2;
            return number1 + " x " + number2 + " = " + result;
        }
        else {
            return "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
        }
    }
}

