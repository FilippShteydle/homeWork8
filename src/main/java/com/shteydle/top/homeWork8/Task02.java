package com.shteydle.top.homeWork8;

/*Написать и протестировать перегруженный метод, выводящий на экран:
■ одномерный массив типа int;
■ одномерный массив типа String;
■ двухмерный массив типа int;
■ двухмерный массив типа float.*/

import java.util.Arrays;

public class Task02 {

    public static void getmassive(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void getmassive(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void getmassive(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void getmassive(float[][] arr) {
        for (float[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
