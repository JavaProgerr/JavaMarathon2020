package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane fokker = new Airplane("Fokker", 2010, 25, 8000);
        fokker.info();
        fokker.setYear(2015);
        fokker.setLength(30);
        fokker.fillUp(300);
        fokker.fillUp(350);
        fokker.info();
    }
}
