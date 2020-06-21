package org.example.module1.view;

import org.example.module1.level1.Task1;

import java.util.Random;

public class Main {

    public static void blankspace() {
        System.out.println("\n---------------------------------------------------\n");
    }

    public static void uniqueSymbols() {
        blankspace();
        Random random = new Random();
        System.out.println("Уровень 1 Задача 1\nДан массив чисел. Вернуть число уникальных символов.");
        System.out.println("Исходный массив (размерностью от 0 до 10) случайных чисел (от 0 до 10):");
        int N = random.nextInt(10 + 1);
        int[] task1args = new int[N];
        for (int elem : task1args) {
            elem = random.nextInt(10 + 1);
            System.out.print(elem + "\t");
        }
        System.out.println("\nВ массиве уникальных чисел: " + Task1.countUniqueSymbols(task1args)+".");
        blankspace();
    }

    public static void main(String[] args) {
        uniqueSymbols();

    }

}
