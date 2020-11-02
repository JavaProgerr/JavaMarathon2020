package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane fokker = new Airplane("Fokker", 2010, 44, 8000);
        Airplane tu = new Airplane("Tu", 2011, 25, 8000);

        Airplane.compareAirplanes(fokker,tu);
    }
}