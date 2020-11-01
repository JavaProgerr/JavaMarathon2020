package day6;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.info();
        bmw.setYear(1995);
        System.out.println(bmw.yearDifference(2005));

        Motorbike suzuki = new Motorbike("Suzuki", "Green", 1992);
        suzuki.info();
        System.out.println(suzuki.yearDifference(2010));


    }
}
