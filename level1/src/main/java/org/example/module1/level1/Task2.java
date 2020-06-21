package org.example.module1.level1;

public class Task2 {

    public static boolean isMoveAvailable(int x1, int y1, int x2, int y2) {
        if ((Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1) || (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2))
            return true;
        else return false;
    }
}


