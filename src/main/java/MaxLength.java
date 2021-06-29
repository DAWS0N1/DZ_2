import java.util.Scanner;

public class MaxLength {
    /**
     * Программа поиска самого длинного слова,
     * считает по 4 основным математическим операциям
     *
     * @author Геворгян Ара
     * @version 1.0
     */
    public MaxLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int lengthInt = scanner.nextInt();

        String[] arrayString = new String[lengthInt];
        String max = "";

        for (int i = 0; i<lengthInt; i++) {
            System.out.println("Введите " + (i+1) + " слово:");
            arrayString[i] = scanner.next();
            if (arrayString[i].length() > max.length())
                max = arrayString[i];
        }

        System.out.println("Самое длинное слово: " + max);
    }
}
