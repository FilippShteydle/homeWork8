package com.shteydle.top.homeWork8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите действие: \n 0 - создать нулевую матрицу; \n 1 - создать единичную матрицу;\n");
        System.out.print(" 2 - выполнить сложение матриц; \n 3 - выполнить умножение матриц; \n 4 - выполнить умножение матрицы на скаляр;" +
                "\n 5 - определить детерминант матрицы.\n 6 - создать массив строк\n");
        int m = scanner.nextInt();
        if (m < 5) {
            System.out.print("Введите размер матрицы: ");
            int size = scanner.nextInt();
            if (m == 0) {
                Task01.createNullMatrix(size);
            }
            if (m == 1) {
                Task01.createSingleMatrix(size);
            }
            if (m == 2) {
                Task01.getSumMatrix(size);
            }
            if (m == 3) {
                Task01.getMultipMatrix(size);
            }
            if (m == 4) {
                System.out.print("Введите на какое число умножить: ");
                int scalar = scanner.nextInt();
                Task01.getMutipScalar(size, scalar);
            }
        }
        
        if (m == 5) {
            System.out.println("Выберите, какая матрица вам нужна: 2 - для матрицы 2х2, 3 - для матрицы 3х3");
            Task01.getDeterminant(scanner.nextInt());
        }
        
        if (m == 6) {
            System.out.print("Укажите количество строк: ");
            int n = scanner.nextInt();
            System.out.println("Начальный массив:");
            Task03.createString(n);
            System.out.println("Печать массива через пробел:");
            Task03.printSpaceString(Task03.arr);
            System.out.println("Массив, отсортированный в обратном порядке:");
            Task03.sortReverseMassive(Task03.arr);
            System.out.println("Массив, отсортированный по количеству слов:");
            Task03.sortQuantityWorld(Task03.arr);
        }
    }
}
