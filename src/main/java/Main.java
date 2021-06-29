import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите '1' чтобы запустить калькулятор;\nВведите '2' чтобы запустить поиск максимального слова");

        int prog = scanner.nextInt();

        switch (prog){
            case 1:
                new Calculator();
                break;
            case 2:
                new MaxLength();
                break;
        }
    }
}
