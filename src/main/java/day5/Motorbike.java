package day5;

public class Motorbike {
    private int issue_year;
    private String colour;
    private String model;

    public int getIssue_year() {
        return issue_year;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(int issue_year, String colour, String model) {
        this.issue_year = issue_year;
        this.colour = colour;
        this.model = model;
    }
}
