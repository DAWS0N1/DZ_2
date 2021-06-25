package MathOperations;

//Вычитание
public class Subtraction {
    /**
     * Конструктор реализующий операцию вычитание
     *
     * @param first
     * @param second
     */
    public Subtraction(float first, float second) {
        //здесь считается разность введенных чисел и ответ записывается в переменную answer
        float answer = first - second;

        //вывод в консоль отформатированного ответа, до 10 символов с округлением до 4-х цифр после запятой
        System.out.printf("Разность равна:" + "%10.4f", answer);
    }
}
