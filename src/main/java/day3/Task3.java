package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        while (b < 5) {
            b++;
            double i = sc.nextDouble();
            double j = sc.nextDouble();
            if (j == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(i / j);
        }
    }
}
