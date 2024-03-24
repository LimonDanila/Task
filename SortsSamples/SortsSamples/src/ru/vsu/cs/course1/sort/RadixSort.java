package ru.vsu.cs.course1.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class RadixSort {

    public static void radixSort(Integer[] list) {
        List<Integer>[] temp = new ArrayList[10];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new ArrayList<>();
        }

        int divider = 1, tmp = -1;
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (Integer i: list) {
                tmp = i / divider;
                temp[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            int a = 0;
            for (int j = 0; j < 10; j++) {
                for (Integer i: temp[j]) {
                    list[a++] = i;
                }
                temp[j].clear();
            }
            divider *= 10;
        }

    }
}
