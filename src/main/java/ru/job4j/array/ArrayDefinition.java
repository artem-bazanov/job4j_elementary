package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Ivan Petrov";
        names[2] = "Ivan Sidorov";
        names[3] = "Ivan Neivan";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surname.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0] + System.lineSeparator() + names[1] + System.lineSeparator() + names[2] + System.lineSeparator() + names[3]);
    }
}
