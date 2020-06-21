package org.example.module1.view;

import org.example.module1.level2.Task4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.module1.level1.Task1;
import org.example.module1.level1.Task2;
import org.example.module1.level1.Task3;

public class MainTest {

    @Test
    public void task1(){
        assertEquals(6, Task1.countUniqueSymbols(new int [] {1,2,4,5,5,5,2,5,6,7}));
        assertEquals(1, Task1.countUniqueSymbols(new int [] {1, 1, 1}));
        assertEquals(0, Task1.countUniqueSymbols(new int [] {}));
    }

    @Test
    public void task2(){
        assertTrue(Task2.isMoveAvailable(1,2,2,4));
        assertFalse(Task2.isMoveAvailable(4,4,7,7));
    }

    @Test
    public void task3(){
        assertEquals(115,Math.round(new Task3().calculateTriangleArea(8,3,-6,-9,-10,4)));
        assertEquals(0,new Task3().calculateTriangleArea(1,1,1,1,1,1));
    }

    @Test
    public void task4(){
        assertTrue(Task4.isStringValid("a{s(asd[asd]ladk;d,aas.)}"));
        assertFalse(Task4.isStringValid("{((sdsd[sf]))"));
        assertTrue(Task4.isStringValid(""));
    }

}

