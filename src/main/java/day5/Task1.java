package day5;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setIssue_year(1985);
        bmw.setColour("Green");
        bmw.setModel("Bmw");

        System.out.println(bmw.getModel() + " " + bmw.getColour() + " " + bmw.getIssue_year());
    }
}
