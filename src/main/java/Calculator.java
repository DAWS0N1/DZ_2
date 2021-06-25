import MathOperations.*;

import java.util.Scanner;

/**
 * Программа калькулятор,
 * считает по 4 основным математическим операциям
 *
 * @author Геворгян Ара
 * @version 1.0
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        float first = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float second = scanner.nextFloat();

        System.out.println("Выберите оператор (Умножение | Сложение | Деление | Вычитание)");
        String operator = scanner.next();

        // условия для выбора оператора калькулятора
        if (operator.equalsIgnoreCase("Умножение")) {
            new Multiplication(first, second); // вызов класса умножения
        }
        else if (operator.equalsIgnoreCase("Сложение")) {
            new Addition(first, second); //  вызов класса сложения
        }
        else if (operator.equalsIgnoreCase("Деление")) {
            new Division(first, second); // вызов класса деления
        }
        else if (operator.equalsIgnoreCase("Вычитание")) {
            new Subtraction(first, second); // вызов класса вычитание
        }
    }
}
