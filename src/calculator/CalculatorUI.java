package calculator;

import java.util.Scanner;

public class CalculatorUI {
    public static void main(String[] args) {
        double number1;
        double number2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        number1 = sc.nextDouble();

        System.out.println("Zahl 2: ");
        number2 = sc.nextDouble();

        char operator;

        System.out.println("Operator: ");
        operator = sc.next().charAt(0);

        Calculator calculator = new Calculator();
        String result = calculator.calculate(number1, number2, operator);
        System.out.println(result);
    }
}
