package lesson_7;


/* Задача наполнить бассейн. Нужно посчитать,
сколько литров воды нужно для заполнения бассейна.
Известно, что бассейн имеет линейные размеры a × b × c,
заданные в метрах.
Эти размеры запрашиваются у пользователя.
Прграмма должна вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину бассейна в метрах: ");
        int length = scan.nextInt();
        System.out.println("Введите ширину бассейна в метрах: ");
        int width = scan.nextInt();
        System.out.println("Введите глубину бассейна в метрах: ");
        int depth = scan.nextInt();

        int result = length * width * depth * 1000;

        System.out.println("Для наполнения бассейна необходимо " + result + " литров воды");

    }
}
