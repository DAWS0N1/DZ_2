package MathOperations;

//Сложение
public class Addition {
    /**
     * Конструктор реализующий операцию сложение
     *
     * @param first
     * @param second
     */
    public Addition(float first, float second) {
        //здесь считается сумма введенных чисел и ответ записывается в переменную answer
        float answer = first + second;

        //вывод в консоль отформатированного ответа, до 10 символов с округлением до 4-х цифр после запятой
        System.out.printf("Сумма равна:" + "%10.4f", answer);
    }
}
