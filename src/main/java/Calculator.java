import MathOperations.Addition;
import MathOperations.Division;
import MathOperations.Multiplication;
import MathOperations.Subtraction;

import java.util.Scanner;

/**
 * Программа калькулятор,
 * считает по 4 основным математическим операциям
 *
 * @author Геворгян Ара
 * @version 1.0
 */
public class Calculator {

    public Calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        float first = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float second = scanner.nextFloat();

        System.out.println("Выберите оператор ('*' | '+' | '/' | '-')");
        String operator = scanner.next();

        // условия для выбора оператора калькулятора
        if (operator.equals("*")) {
            new Multiplication(first, second); // вызов класса умножения
        }
        else if (operator.equals("+")) {
            new Addition(first, second); //  вызов класса сложения
        }
        else if (operator.equals("/")) {
            new Division(first, second); // вызов класса деления
        }
        else if (operator.equals("-")) {
            new Subtraction(first, second); // вызов класса вычитание
        } else
            System.out.println("Неверный оператор");
    }
}
