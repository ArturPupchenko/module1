package org.example.module1.view;

import org.example.module1.level1.Task1;
import org.example.module1.level1.Task2;

import java.util.Random;

public class Main {

    public static void blankspace() {
        System.out.println("\n---------------------------------------------------\n");
    }

    public static void uniqueSymbols() {
        Random random = new Random();
        System.out.println("Уровень 1 Задача 1\nДан массив чисел. Вернуть число уникальных символов.");
        System.out.println("Исходный массив (размерностью от 0 до 10) случайных чисел (от 0 до 10):");
        int N = random.nextInt(10 + 1);
        int[] task1args = new int[N];
        for (int elem : task1args) {
            elem = random.nextInt(10 + 1);
            System.out.print(elem + "\t");
        }
        System.out.println("\nВ массиве уникальных чисел: " + Task1.countUniqueSymbols(task1args) + ".");
        blankspace();
    }

    public static void canHorseMove() {
        Random random = new Random();
        System.out.println("Уровень 1 Задача 2\nХод коня по бесконечной шахматной доске.\nВводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.\n" +
                "Программа проверяет, возможно ли это сделать.");
        int x1 =random.nextInt(10 + 1);
        int x2 =random.nextInt(10 + 1);
        int y1 =random.nextInt(10 + 1);
        int y2 =random.nextInt(10 + 1);
        System.out.println("\nСлучайно сгенерированные начальное и конечное положение коня (от 0 до 10):\n" +
                + x1+", " + y1 + "\n" + x2+", " + y2);
        if (Task2.isMoveAvailable(x1,y1,x2,y2)) System.out.println("Этот ход возможен!");
        else System.out.println("Этот ход невозможен!");
        blankspace();
    }

    public static void main(String[] args) {
        blankspace();
        uniqueSymbols();
        canHorseMove();

    }

}
