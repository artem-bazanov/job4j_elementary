package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int al = array.length;
        for (int i = 0; i < al / 2; i++) {
            int temp = array[al - i - 1];
            array[al - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
