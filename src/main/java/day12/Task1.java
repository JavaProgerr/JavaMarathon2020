package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("audi");
        car.add("bmw");
        car.add("skoda");
        car.add("opel");
        car.add("nissan");
        System.out.println(car);
        car.add(2, "lada");
        System.out.println(car);
        car.remove(0);
        System.out.println(car);
    }
}
