package com.shteydle.top.homeWork8;
/*В массиве хранится n явно заданных текстовых строк. Создать метод:
■ выводящий содержимое массива в строку через пробел;
■ сортирующий массив в обратном порядке (без учета регистра) от z до a;
■ сортирующий массив по количеству слов в строке (слова разделены пробелами).
Программа должна вывести строки в начальном и отсортированном порядке.
Дополнительно: 1 балл за генерацию случайных уникальных строк реализованных в виде метода.*/

import java.util.Arrays;
import java.util.Random;

public class Task03 {

    public static String[] arr;

//Генерация случайных уникальных строк.
    public static void createString (int m) {

        String str = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder symbol = new StringBuilder();
        arr = new String[m];
        for (int i = 0; i < m; i++) {
            int st = random.nextInt(3, 15);
            int spaсe = random.nextInt(4, 8);
            for (int j = 0; j < st; j++) {
                if (j % spaсe == 0) {
                    symbol.append(" ");
                } else {
                    int position = random.nextInt(0, str.length());
                    symbol.append(str.charAt(position));
                }
            }
            for (int k = 0; k < arr.length; k++) {
                if (!symbol.equals(arr[k])) {
                    arr[i] = String.valueOf(symbol);
                } else {
                    for (int j = 0; j < st; j++) {
                        int position = random.nextInt(0, str.length());
                        symbol.append(str.charAt(position));
                        arr[i] = String.valueOf(symbol);
                    }
                }
            }
            symbol = new StringBuilder();
        }
        Task03.printString(arr);
    }

    // Печать массива через пробел
    public static void printSpaceString (String[] arr) {
        for (String a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    // Печать массива
    public static void printString (String[] arr) {
        for (String a : arr) {
            System.out.print(a + ";");
        }
        System.out.println("");
    }

    // Обратная сортировка массива
    public static void sortReverseMassive (String[] arr) {
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        arr = arr2;
        Task03.printString(arr);
    }

    // Сортировка массива по количеству строк
    public static void sortQuantityWorld (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value.split(" ").length < arr[j].split(" ").length) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
        Task03.printString(arr);
    }
}
