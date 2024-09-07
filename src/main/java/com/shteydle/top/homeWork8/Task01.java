package com.shteydle.top.homeWork8;

/*Написать и протестировать методы работы с квадратными
матрицами (матрицы представить в виде двухмерных массивов).
Должны присутствовать методы:
■ создания единичной (диагональной) матрицы;
■ создания нулевой матрицы;
■ сложение матриц;
■ умножения матриц;
■ умножение матрицы на скаляр;
■ определение детерминанта матрицы;
■ вывод матрицы на консоль.*/


import java.util.Arrays;
import java.util.Random;

public class Task01 {

    // Создание нулевой матрицы
    public static void createNullMatrix(int size) {

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
        }
        Task01.printMatrix(matrix);
    }

    // Создание еденичной матрицы
    public static void createSingleMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        Task01.printMatrix(matrix);
    }

    // Сумма двух матриц
    public static void getSumMatrix (int size) {

        int[][] matrix = Task01.getMatrix(size);
        int[][] matrix2 = Task01.getMatrix(size);
        int[][] matrixResult = Task01.getMatrix(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixResult[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Сложение матрицы:");
        Task01.printMatrix(matrix);
        System.out.println("С матрицей:");
        Task01.printMatrix(matrix2);
        System.out.println("Дадут результат:");
        Task01.printMatrix(matrixResult);

    }
    // Произведение двух матриц
    public static void getMultipMatrix(int size) {

        int[][] matrix = Task01.getMatrix(size);
        int[][] matrix2 = Task01.getMatrix(size);
        int[][] matrixResult = Task01.getMatrix(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    matrixResult[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Произведение матрицы:");
        Task01.printMatrix(matrix);
        System.out.println("С матрицей:");
        Task01.printMatrix(matrix2);
        System.out.println("Даст результат:");
        Task01.printMatrix(matrixResult);
    }

    // Умножение матрицы на скаляр
    public static void getMutipScalar(int size, int scalar) {
        int[][] matrix = Task01.getMatrix(size);
        System.out.println("Умножение матрицы:");
        Task01.printMatrix(matrix);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] *= scalar;
            }
        }
        System.out.println("На число " + scalar + " даст матрицу: ");
        Task01.printMatrix(matrix);
    }

    //Детерминант матрицы
    public static void getDeterminant(int size) {

        int[][] matrix = Task01.getMatrix(size);
        int determinant = 0;
        System.out.println("Детерминант матрицы: ");
        Task01.printMatrix(matrix);
        System.out.print("равен: ");

        if (size == 2) {
            determinant = Math.abs(matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        }
        if (size == 3) {
            determinant = Math.abs(matrix[0][0] * matrix[1][1] * matrix[2][2] + matrix[0][1] * matrix[1][2] * matrix[2][0] +
                    matrix[1][0] * matrix[2][1] * matrix[0][2] - matrix[0][2] * matrix[1][1] * matrix[2][0] -
                    matrix[0][1] * matrix[1][0] * matrix[2][2] - matrix[0][0] * matrix[1][2] * matrix[2][1]);
        }
        System.out.println(determinant);
    }

    // печать матрицы
    public static void printMatrix (int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Создание матрицы
    public static int[][] getMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(0, 5);
            }
        }
        return matrix;
    }
}

