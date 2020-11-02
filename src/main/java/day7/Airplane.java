package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public static void compareAirplanes(Airplane fokker, Airplane tu){
        if (fokker.length> tu.length){
            System.out.println(fokker.producer + " длиннее "+ tu.producer);
        }else if (fokker.length<tu.length){
            System.out.println(tu.producer + " длиннее "+ fokker.producer);
        }else {
            System.out.println("Длинны равны");
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + getFuel());
    }

    public int fillUp(int fill) {
        return fuel = fuel + fill;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
