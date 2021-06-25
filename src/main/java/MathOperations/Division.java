package MathOperations;

//Деление
public class Division {
    /**
     * Конструктор реализующий операцию деление
     *
     * @param first
     * @param second
     */
    public Division(float first, float second) {
        //здесь считается частное введенных чисел и ответ записывается в переменную answer
        float answer = first / second;

        //вывод в консоль отформатированного ответа, до 10 символов с округлением до 4-х цифр после запятой
        System.out.printf("Произведение равно:" + "%10.4f", answer);
    }
}
