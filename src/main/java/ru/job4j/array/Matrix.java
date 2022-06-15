package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int sell = 0; sell < size; sell++) {
                array[row][sell] = (row + 1) * (sell + 1);
            }
        }
        return array;
    }
}
