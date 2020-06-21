package org.example.module1.level1;

import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public static int countUniqueSymbols(int [] arg){
        List <Integer> symbols = new LinkedList<>();
        for(int elem : arg) {
            if (!symbols.contains(elem)) symbols.add(elem);
            }
        if (symbols.isEmpty()) return 0;
            else return symbols.size();
    }
}
