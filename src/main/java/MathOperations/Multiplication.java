package MathOperations;

//Умножение
public class Multiplication {
    /**
     * Конструктор реализующий операцию умножение
     *
     * @param first
     * @param second
     */
    public Multiplication(float first, float second) {
        //здесь считается произведение введенных чисел и ответ записывается в переменную answer
        float answer = first * second;

        //вывод в консоль отформатированного ответа, до 10 символов с округлением до 4-х цифр после запятой
        System.out.printf("Произведение равно:" + "%10.4f", answer);
    }
}
