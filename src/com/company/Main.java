package com.company;

import java.util.Scanner;

public class Main {
    public void name() {
        Scanner scan = new Scanner(System.in);

        System.out.println("정사각 행렬 크기");
        int x = scan.nextInt();
        int y = scan.nextInt();

        int[][] arr = new int[x][y];
        int[][] arr2 = new int[x][y];

        System.out.println("행렬의 길이" + arr.length);

        int[][] arr3 = new int[x][y];

        System.out.println("첫번째 행렬 값 입력");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("두번째 행렬 값 입력");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int sum = 0;
                for (int k = 0; k < y; k++) {
                    sum += arr[i][k] * arr2[k][j];
                }
                arr3[i][j] = sum;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main m = new Main();
        m.name();
    }
}
