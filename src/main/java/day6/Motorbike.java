package day6;

public class Motorbike {
    private String model;
    private String color;
    private int issue_year;

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year){
        return issue_year - year;
    }

    public int getIssue_year() {
        return issue_year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(String model, String color, int issue_year) {
        this.model = model;
        this.color = color;
        this.issue_year = issue_year;
    }
}
