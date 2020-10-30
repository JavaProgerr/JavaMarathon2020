package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike suzuki = new Motorbike(2005, "Blue", "Suzuki");
        System.out.println(suzuki.getModel() + " " + suzuki.getColour() + " " + suzuki.getIssue_year());
    }
}
