import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scan = new Scanner(System.in);
        int N = 0;
        int M = 0;
        int f = 0;
        System.out.println("Добрый день!Введите размер списка: ");
        if (scan.hasNextInt()) {
            N = scan.nextInt();
            if (N <= 0) {
                logger.log("Введенное число не корректно");
            }
        } else {
            logger.log("Вы ввели не число, введите целое число!");
        }

        System.out.println("Введите верхнюю границу для значений: ");
        if (scan.hasNextInt()) {
            M = scan.nextInt();
            if (M <= 0) {
                logger.log("Введенное число некорректно");
            }
        } else {
            logger.log("Вы ввели не число, введите число!");
        }

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        System.out.println("Вот случайный список: " + list);
        System.out.println("Введите порог для фильтра: ");
        if (scan.hasNextInt()) {
            f = scan.nextInt();
            if (f <= 0 || f >= M) {
                logger.log("Введенное число некорректно");
            }
        } else {
            logger.log("Вы ввели не число, введите число!");
        }

        logger.log("Запускаем фильтр");
        Filter filter = new Filter(f);
        filter.filterOut(list);
        logger.log("Завершаем программу");

    }
}
