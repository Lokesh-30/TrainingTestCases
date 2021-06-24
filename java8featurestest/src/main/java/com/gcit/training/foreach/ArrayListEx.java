package com.gcit.training.foreach;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx{

    public List<Integer> forEach() {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int index = 0; index < 5; index++) {
            numberList.add(index);
        }

       return numberList ;
    }
}
