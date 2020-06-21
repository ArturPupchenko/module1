package org.example.module1.view;

import org.example.module1.level1.Task1;
import org.example.module1.level1.Task2;
import org.example.module1.level1.Task3;

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
        int x1 = random.nextInt(10 + 1);
        int x2 = random.nextInt(10 + 1);
        int y1 = random.nextInt(10 + 1);
        int y2 = random.nextInt(10 + 1);
        System.out.println("\nСлучайно сгенерированные начальное и конечное положение коня (от 0 до 10):\n" +
                +x1 + ", " + y1 + "\n" + x2 + ", " + y2);
        if (Task2.isMoveAvailable(x1, y1, x2, y2)) System.out.println("Этот ход возможен!");
        else System.out.println("Этот ход невозможен!");
        blankspace();
    }

    public static void triangleArea() {
        Random random = new Random();
        System.out.println("Уровень 1 Задача 3\nДаны точки A,B,C  на плоскости.  Вычислить площадь  треугольника ABC.");
        int x1 = -10 + random.nextInt(20 + 1);
        int x2 = -10 + random.nextInt(20 + 1);
        int x3 = -10 + random.nextInt(20 + 1);
        int y1 = -10 + random.nextInt(20 + 1);
        int y2 = -10 + random.nextInt(20 + 1);
        int y3 = -10 + random.nextInt(20 + 1);
        System.out.println("\nСлучайно сгенерированные координаты точек (от -10 до 10):\n" +
                + x1 + ", " + y1 + "\n" + x2 + ", " + y2 + "\n" + x3 + ", " + y3);
        double area = new Task3().calculateTriangleArea(x1,y1,x2,y2,x3,y3);
        if (area > 0) {
            System.out.println("Площадь заданного треугольника равна ");
            System.out.format("%.3f%n", area);
        }
        else System.out.println("Треугольник не существует!");
        blankspace();
    }


    public static void main(String[] args) {
        blankspace();
        uniqueSymbols();
        canHorseMove();
        triangleArea();

    }

}
