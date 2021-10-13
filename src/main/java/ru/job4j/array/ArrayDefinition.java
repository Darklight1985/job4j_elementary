package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {

        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Dmitriy Kolesnev";
        names[1] = "Yurij Gagarin";
        names[2] = "Bill Gejts";
        names[3] = "Ilon Mask";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        for (String s: names) {
            System.out.println(s);
        }
    }
}
