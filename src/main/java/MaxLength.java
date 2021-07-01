import java.util.Scanner;

public class MaxLength {

    public MaxLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int lengthInt = scanner.nextInt();

        String[] arrayString = new String[lengthInt];
        String max = "";
        String maxLength = "";

        for (int i = 0; i<lengthInt; i++) {
            System.out.println("Введите " + (i+1) + " слово:");
            arrayString[i] = scanner.next();
            if (arrayString[i].length() > maxLength.length()) {
                max = arrayString[i];
                maxLength = arrayString[i];
            } else if (arrayString[i].length() == maxLength.length()) {
                max += ", " + arrayString[i];
            }
        }

        System.out.println("Самое длинное слово: " + max);
    }
}
