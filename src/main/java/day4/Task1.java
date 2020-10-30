package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Длина массива: " + mas.length);
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int sum = 0;
        for (int i : mas) {
            if (i > 8) {
                b++;
            }
            if (i == 1) {
                c++;
            }
            if (i % 2 == 0) {
                d++;
            }
            if (i % 2 != 0) {
                e++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println(sum);
        System.out.println("Количество чисел больше 8: " + b);
        System.out.println("Количество чисел равных 1: " + c);
        System.out.println("Количество четных чисел: " + d);
        System.out.println("Количество нечетных чисел: " + e);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
