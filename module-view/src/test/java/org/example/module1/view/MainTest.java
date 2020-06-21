package org.example.module1.view;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.module1.level1.Task1;
import org.example.module1.level1.Task2;

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

}

