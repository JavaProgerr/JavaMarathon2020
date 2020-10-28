package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while (a) {
            double i = sc.nextDouble();
            double j = sc.nextDouble();
            if (j == 0) {
                break;
            }
            System.out.println(i / j);
        }
    }
}
