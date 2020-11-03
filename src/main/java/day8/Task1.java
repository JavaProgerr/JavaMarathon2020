package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str = str + i + " ";
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения с String: "+ (finish-start));
        System.out.println(str);

        StringBuilder str2 = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str2.append(i).append(" ");
        }
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения с StringBuilder: "+ (finish-start));
        System.out.println(str2);
    }
}
