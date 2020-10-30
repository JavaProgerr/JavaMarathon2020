package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10000);
        }
        int max = 0;
        int min = 10000;
        int zero = 0;
        int sum = 0;
        for (int i:array) {
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
            if (i%10==0){
                zero++;
            }
            if (i%10==0){
                sum = sum + i;
            }
        }
        System.out.println("наибольший элемент массива array: " + max);
        System.out.println("наименьший элемент массива array: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + zero);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
